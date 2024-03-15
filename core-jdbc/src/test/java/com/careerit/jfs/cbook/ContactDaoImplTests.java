package com.careerit.jfs.cbook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ContactDaoImplTests {

        ContactDaoUtil contactDaoUtil = new ContactDaoUtil();

        @Test
        @DisplayName("Get all contacts")
        void getAllContacts() {
             contactDaoUtil.deleteAllContacts();
             ContactDaoImpl contactDao = new ContactDaoImpl();
             contactDao.insertContact(ContactSeedData.getContact());
             List<Contact> list = contactDao.selectContacts();
             assertEquals(1, list.size());
        }

        @Test
        @DisplayName("Get all contacts by adding multiple contacts")
        void getAllContactsByMultipleContacts() {
             contactDaoUtil.deleteAllContacts();
             ContactDaoImpl contactDao = new ContactDaoImpl();
             List<Contact> contacts = ContactSeedData.getContacts();
             for(Contact contact: contacts){
                    contactDao.insertContact(contact);
             }
             List<Contact> contactList = contactDao.selectContacts();
             assertEquals(2, contactList.size());
        }

        @Test
        @DisplayName("Get contact by id")
        void getContactById() {
             contactDaoUtil.deleteAllContacts();
             ContactDaoImpl contactDao = new ContactDaoImpl();
             Contact contact = ContactSeedData.getContact();
             long cid = contactDao.insertContact(contact);
             Contact existingContact = contactDao.selectContact(cid);
             assertEquals(contact.getName(), existingContact.getName());
             assertEquals(contact.getEmail(), existingContact.getEmail());
             assertEquals(contact.getMobile(), existingContact.getMobile());
        }
        @Test
        @DisplayName("Update contact email")
        void updateContact(){
            long cid = 1001;
            String email = "junkmail@gmail.com";
            contactDaoUtil.deleteAllContacts();
            ContactDaoImpl contactDao = new ContactDaoImpl();
            Contact contact = contactDao.updateEmail(cid, email);
            assertNull(contact);
        }




}
