package com.careerit.jfs.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {


    public static void main(String[] args) {

        showAllEmployees();
        showEmployeeCount();

    }

    private static void showEmployeeCount() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            con = DbConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select count(*) from emp");
            if(rs.next()){
                System.out.println("Total employees : "+rs.getInt(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            DbConnectionUtil.close(rs, st, con);
        }
    }

    private static void showAllEmployees() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            con = DbConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select empno,ename,sal from emp");
            while(rs.next()){
                System.out.println(rs.getInt("empno"));
                System.out.println(rs.getString("ename"));
                System.out.println(rs.getDouble("sal"));
                System.out.println("--------------------");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            DbConnectionUtil.close(rs, st, con);
        }
    }
}
