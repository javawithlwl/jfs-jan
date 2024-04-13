package com.careerit.cbook;

import java.util.List;

public interface ContactDao {

        Contact insertContact(Contact contact);
        Contact updateContact(Contact contact);
        List<Contact> selectContacts();
        List<Contact> search(String str);
        boolean deleteContact(long id);
        Contact selectContact(long id);
        int[] insertContacts(List<Contact> contacts);
}
