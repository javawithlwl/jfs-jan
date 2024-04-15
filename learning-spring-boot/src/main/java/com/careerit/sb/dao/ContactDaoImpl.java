package com.careerit.sb.dao;

import com.careerit.sb.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao{

    private static final String SELECT_CONTACTS = "SELECT id,name,mobile,city FROM contact";
    private static final String INSERT_CONTACT = "INSERT INTO contact(name,mobile,city) VALUES(?,?,?)";
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Contact> selectContacts() {
        return jdbcTemplate.query(SELECT_CONTACTS, (rs, rowNum) -> {
            Contact contact = new Contact();
            contact.setId(rs.getInt("id"));
            contact.setName(rs.getString("name"));
            contact.setMobile(rs.getString("mobile"));
            contact.setCity(rs.getString("city"));
            return contact;
        });
    }

    public Contact insertContact(Contact contact) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(INSERT_CONTACT, new String[]{"id"});
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getMobile());
            ps.setString(3, contact.getCity());
            return ps;
        }, keyHolder);
        if(keyHolder.getKey() != null){
            long id = keyHolder.getKey().longValue();
            contact.setId(id);
        }
        return contact;
    }
}
