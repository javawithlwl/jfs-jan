package com.careerit.jfs.iplcorestats;

import java.util.List;

public class IplStatsManager {

    public static void main(String[] args) {

        IplStatsService iplStatsService = new IplStatsServiceImpl();
        // 1. Get team names
        List<String> teamNames = iplStatsService.teamNames();
        System.out.println("Team names : "+teamNames);
        // 2. Get players by team name
        String teamName = "RCB";
        List<Player> players = iplStatsService.playersByTeam(teamName);
        System.out.println("The team "+teamName+" has "+players.size()+" players");

        // 3. Get role count by team name
        List<TeamRoleCountRecord> teamRoleCountRecords = iplStatsService.roleCountByTeam(teamName);
        System.out.println("Role count by team : "+teamRoleCountRecords);

    }
}
