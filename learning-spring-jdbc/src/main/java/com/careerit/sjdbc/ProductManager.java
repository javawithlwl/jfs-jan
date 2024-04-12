package com.careerit.sjdbc;

import java.sql.*;

public class ProductManager {

    public static void main(String[] args) {
        showProductDetails();
    }

    public static void showProductDetails(){
        Statement st = null;
        ResultSet rs = null;
        Connection con = null;
        try{
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select id,name,price from product");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("price"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(rs,st,con);
        }
    }

    public static void close(AutoCloseable... closeables) {
        for (AutoCloseable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/lwl_db?allowPublicKeyRetrieval=true&useSSL=false";
            String username = "dbuser";
            String password = "dbuser";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
