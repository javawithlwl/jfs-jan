package com.careerit.iplstats.migrate;

import com.careerit.iplstats.util.ConnectionUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MigratePlayerData {


    public void migrate() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            PlayerDto[] players = mapper.readValue(this.getClass().getResourceAsStream("/player-data.json"), PlayerDto[].class);
            clearAndInsert(players);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void clearAndInsert(PlayerDto[] players) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement("truncate table player");
            pst.execute();
            pst = con.prepareStatement("insert into player(name,role,team_name,amount) values(?,?,?,?)");
            for (PlayerDto player : players) {
                pst.setString(1, player.getName());
                pst.setString(2, player.getRole());
                pst.setString(3, player.getTeamName());
                pst.setDouble(4, player.getAmount());
                pst.addBatch();
            }
            pst.executeBatch();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionUtil.close(pst, con);
        }
    }

    public int playerCount(){
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement("select count(*) from player");
            rs = pst.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ConnectionUtil.close(pst, con);
        }
        return 0;
    }

}
