package com.careerit.iplstats.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public final class ConnectionUtil {

        private ConnectionUtil(){
        }

        private static final Properties props = new Properties();
        static{
            try {
                props.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
            }catch (Exception e) {
                System.out.println("Exception is :"+e.getMessage());
            }
        }

        public static Connection getConnection() {
            Connection con = null;
            try{
                con = DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
            }catch (Exception e) {
                System.out.println("Exception is :"+e.getMessage());
            }
            return con;
        }
        public static void close(AutoCloseable... ac) {
            try{
                for(AutoCloseable a : ac) {
                    if(a != null) {
                        a.close();
                    }
                }
            }catch (Exception e) {
                System.out.println("Exception is :"+e.getMessage());
            }
        }

}
