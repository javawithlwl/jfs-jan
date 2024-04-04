package com.careerit.cbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.cbook.domain.Contact;

public class ContactDaoImpl implements ContactDao{

    private final String ADD_CONTACT = "insert into contact(name,email,mobile) values(?,?,?)";
    private final String SELECT_CONTACT = "select cid,name,email,mobile from contact where cid = ?";

    private final String UPDATE_EMAIL = "update contact set email = ? where cid = ?";
    private final String UPDATE_MOBILE = "update contact set mobile = ? where cid = ?";

    private final String DELETE_CONTACT = "delete from contact where cid = ?";

    private final String SELECT_ALL_CONTACTS = "select cid,name,email,mobile from contact";

    private final String SEARCH_CONTACT = "select cid,name,email,mobile from contact where name ilike ? or email ilike ? or mobile ilike ?";

    @Override
    public long insertContact(Contact contact) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        long id = 0;
        try{
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(ADD_CONTACT, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,contact.getName());
            pst.setString(2,contact.getEmail());
            pst.setString(3,contact.getMobile());
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        }catch (SQLException e){
            System.out.println("Error : "+e.getMessage());
        }finally {
            DbConnectionUtil.close(rs,pst,con);
        }
        return id;
    }

    @Override
    public Contact selectContact(long cid) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Contact contact = null;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(SELECT_CONTACT);
            pst.setLong(1, cid);
            rs = pst.executeQuery();
            if (rs.next()) {
                contact = new Contact();
                contact.setCid(rs.getLong("cid"));
                contact.setName(rs.getString("name"));
                contact.setEmail(rs.getString("email"));
                contact.setMobile(rs.getString("mobile"));
            }
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(rs,pst,con);
        }
        return contact;
    }

    @Override
    public Contact updateEmail(long cid, String email) {
        Connection con = null;
        PreparedStatement pst = null;
        Contact contact = null;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(UPDATE_EMAIL);
            pst.setString(1, email);
            pst.setLong(2, cid);
            pst.executeUpdate();
            contact = selectContact(cid);
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(pst,con);
        }
        return contact;
    }

    @Override
    public Contact updateMobile(long cid, String mobile) {
        Connection con = null;
        PreparedStatement pst = null;
        Contact contact = null;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(UPDATE_MOBILE);
            pst.setString(1, mobile);
            pst.setLong(2, cid);
            pst.executeUpdate();
            contact = selectContact(cid);
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(pst,con);
        }
        return contact;
    }

    @Override
    public boolean deleteContact(long cid) {
        Connection con = null;
        PreparedStatement pst = null;
        boolean isDeleted = false;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(DELETE_CONTACT);
            pst.setLong(1, cid);
            isDeleted = pst.executeUpdate() == 1;
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(pst,con);
        }
        return isDeleted;
    }

    @Override
    public List<Contact> selectContacts() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Contact> list = new ArrayList<>();
        try {
            con = DbConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(SELECT_ALL_CONTACTS);
            while (rs.next()) {
                Contact contact = new Contact();
                contact.setCid(rs.getLong("cid"));
                contact.setName(rs.getString("name"));
                contact.setEmail(rs.getString("email"));
                contact.setMobile(rs.getString("mobile"));
                list.add(contact);
            }
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(rs,st,con);
        }
        return list;
    }

    @Override
    public List<Contact> search(String str) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Contact> list = new ArrayList<>();
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(SEARCH_CONTACT);
            pst.setString(1,"%"+str+"%");
            pst.setString(2,"%"+str+"%");
            pst.setString(3,"%"+str+"%");
            rs = pst.executeQuery();
            while (rs.next()) {
                Contact contact = new Contact();
                contact.setCid(rs.getLong("cid"));
                contact.setName(rs.getString("name"));
                contact.setEmail(rs.getString("email"));
                contact.setMobile(rs.getString("mobile"));
                list.add(contact);
            }
        }catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            DbConnectionUtil.close(rs,pst,con);
        }
        return list;
    }

    public boolean isContactExists(long cid) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean isExists = false;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement("select count(*) from contact where cid = ?");
            pst.setLong(1, cid);
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



}