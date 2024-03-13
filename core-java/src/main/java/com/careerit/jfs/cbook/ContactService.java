package com.careerit.jfs.cbook;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> contacts;

    public ContactService() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact is added with id :" + contact.getCid());
    }

    public void deleteContact(String cid) {
        Contact contact = getContact(cid);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact is deleted with id :" + cid);
        } else {
            System.out.println("Contact with id :" + cid + " is not found");
        }
    }

    public void updateEmail(String cid, String email) {
        Contact contact = getContact(cid);
        if (contact != null) {
            contact.setEmail(email);
            System.out.println("Email is updated for contact id :" + cid);
        } else {
            System.out.println("Contact with id :" + cid + " is not found");
        }
    }

    public void updateMobile(String cid, String mobile) {
        Contact contact = getContact(cid);
        if (contact != null) {
            contact.setMobile(mobile);
            System.out.println("Mobile is updated for contact id :" + cid);
        } else {
            System.out.println("Contact with id :" + cid + " is not found");
        }
    }

    public void showContactDetails(String cid) {
        Contact contact = getContact(cid);
        if (contact != null) {
            showContact(contact);
        } else {
            System.out.println("Contact with id :" + cid + " is not found");
        }
    }

    public void showAllContacts() {
        if (!contacts.isEmpty()) {
            System.out.println("-".repeat(100));
            for (Contact contact : contacts) {
                showContact(contact);

            }
            System.out.println("-".repeat(100));
        } else {
            System.out.println("No contacts found");
        }
    }

    public void search(String str) {
        boolean isFound = false;
        for (Contact contact : contacts) {
            str = str.toLowerCase();
            if (contact.getName().toLowerCase().contains(str) || contact.getEmail().toLowerCase().contains(str) ||
                    contact.getMobile().toLowerCase().contains(str) || contact.getCid().toLowerCase().contains(str)) {
                showContact(contact);
                System.out.println("-".repeat(100));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No contacts found with search string :" + str);
        }
    }

    private void showContact(Contact contact) {
        System.out.println("CID    : " + contact.getCid());
        System.out.println("Name   : " + contact.getName());
        System.out.println("Email  : " + contact.getEmail());
        System.out.println("Mobile : " + contact.getMobile());
    }

    private Contact getContact(String cid) {
        for (Contact contact : contacts) {
            if (contact.getCid().equals(cid)) {
                return contact;
            }
        }
        return null;
    }
}
