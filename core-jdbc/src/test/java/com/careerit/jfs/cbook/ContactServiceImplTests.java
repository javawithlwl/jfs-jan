package com.careerit.jfs.cbook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactServiceImplTests {
    ContactDaoUtil contactDaoUtil = new ContactDaoUtil();
    ContactService contactService;

    @Test
    void addContact() {
        contactDaoUtil.deleteAllContacts();
        contactService = new ContactServiceImpl();
        Contact contact = ContactSeedData.getContact();
        long cid = contactService.addContact(contact);
        assertNotEquals(0, cid);
    }

    @Test
    @DisplayName("Add contact with duplicate email")
    void addContactWithDuplicateEmail() {
        contactDaoUtil.deleteAllContacts();
        contactService = new ContactServiceImpl();
        Contact contact1 = ContactSeedData.getContact();
        contactService.addContact(contact1);
        Contact contact2 = ContactSeedData.getContactWithEmail("krish.t@gmail.com");
        assertThrows(IllegalArgumentException.class,()->contactService.addContact(contact2));

    }
}
