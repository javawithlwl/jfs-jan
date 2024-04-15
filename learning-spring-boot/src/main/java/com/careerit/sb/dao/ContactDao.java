package com.careerit.sb.dao;

import com.careerit.sb.domain.Contact;

import java.util.List;

public interface ContactDao {
    List<Contact> selectContacts();
    Contact insertContact(Contact contact);
}
