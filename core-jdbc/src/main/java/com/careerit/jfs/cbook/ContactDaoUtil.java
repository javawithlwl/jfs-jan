package com.careerit.jfs.cbook;

import com.careerit.jfs.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactDaoUtil {
    public static final String SELECT_COUNT_FROM_CONTACT_WHERE_MOBILE = "select count(*) from contact where mobile = ?";
    public static final String SELECT_COUNT_FROM_CONTACT_WHERE_EMAIL = "select count(*) from contact where email = ?";
    public static final String DELETE_FROM_CONTACT = "delete from contact";

    public boolean isEmailExists(String email) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean isExists = false;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(SELECT_COUNT_FROM_CONTACT_WHERE_EMAIL);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if (rs.next()) {
                isExists = rs.getInt(1) == 1;
            }
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(rs,pst,con);
        }
        return isExists;
    }
    public boolean isMobileExists(String mobile) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean isExists = false;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(SELECT_COUNT_FROM_CONTACT_WHERE_MOBILE);
            pst.setString(1, mobile);
            rs = pst.executeQuery();
            if (rs.next()) {
                isExists = rs.getInt(1) == 1;
            }
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(rs,pst,con);
        }
        return isExists;
    }

    public int deleteAllContacts(){
        Connection con = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(DELETE_FROM_CONTACT);
            count = pst.executeUpdate();
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(pst,con);
        }
        return count;
    }
}
