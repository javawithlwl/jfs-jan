package com.careerit.sb.service;

import com.careerit.sb.domain.Contact;

import java.util.List;

public interface ContactService {

        List<Contact> getContacts();
        Contact addContact(Contact contact);
}
