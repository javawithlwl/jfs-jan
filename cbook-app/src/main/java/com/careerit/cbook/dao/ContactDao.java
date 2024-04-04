package com.careerit.cbook.dao;

import java.util.List;

import com.careerit.cbook.domain.Contact;

public interface ContactDao {

    long insertContact(Contact contact);
    Contact selectContact(long cid);
    Contact updateEmail(long cid,String email);
    Contact updateMobile(long cid,String mobile);
    boolean deleteContact(long cid);
    List<Contact> selectContacts();
    List<Contact> search(String str);
}