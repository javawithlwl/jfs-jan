package com.careerit.cbook;

import java.util.List;

public interface ContactService {

    Contact addContact(Contact contact);
    Contact updateContact(Contact contact);
    List<Contact> getContacts();
    List<Contact> search(String str);
    boolean deleteContact(long id);
    Contact getContact(long id);
    int[] addContacts(List<Contact> contacts);

}
