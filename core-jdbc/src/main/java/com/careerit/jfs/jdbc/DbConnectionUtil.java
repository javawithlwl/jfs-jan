package com.careerit.jfs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbConnectionUtil {

        private static Properties properties;
        static{
            properties = new Properties();
            try {
                properties.load(DbConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            }catch (Exception e) {
                System.out.println("Error while loading properties file : "+e.getMessage());
            }
        }
        public static Connection getConnection() {
           Connection con = null;
           try{
               con = DriverManager.getConnection(properties.getProperty("db.url"),properties.getProperty("db.username"),properties.getProperty("db.password"));
           }catch (Exception e) {
               System.out.println("Error while getting connection : "+e.getMessage());
           }
           return con;
        }

        public static void close(Connection con) {
            try{
                if(con != null) con.close();
            }catch (Exception e) {
                System.out.println("Error while closing connection : "+e.getMessage());
            }
        }
        public static void close(Statement st,Connection con) {
            try{
                if(st != null) st.close();
                if(con != null) con.close();
            }catch (Exception e) {
                System.out.println("Error while closing statement and connection : "+e.getMessage());
            }
        }
        public static void close(ResultSet rs, Statement st,Connection con) {
            try{
                if(rs != null) rs.close();
                if(st != null) st.close();
                if(con != null) con.close();
            }catch (Exception e) {
                System.out.println("Error while closing resultset, statement and connection : "+e.getMessage());
            }
        }
}
