package com.careerit.cbook.service;

import java.util.List;

import com.careerit.cbook.domain.Contact;

public interface ContactService {

        long addContact(Contact contact);
        Contact getContact(long cid);
        Contact updateEmail(long cid,String email);
        Contact updateMobile(long cid,String mobile);
        boolean deleteContact(long cid);
        List<Contact> getAllContacts();
        List<Contact> search(String str);
}
