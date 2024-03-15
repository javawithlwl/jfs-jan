package com.careerit.jfs.cbook;

import java.util.List;

public class ContactSeedData {

    public static Contact getContact() {
        Contact contact = new Contact();
        contact.setName("Krish");
        contact.setEmail("krish.t@gmail.com");
        contact.setMobile("9876543210");
        return contact;
    }

    public static Contact getContactWithEmail(String email) {
        Contact contact = new Contact();
        contact.setName("Charan");
        contact.setEmail(email);
        contact.setMobile("9876543213");
        return contact;
    }

    public static Contact getContactWithMobile(String mobile) {
        Contact contact = new Contact();
        contact.setName("Charan");
        contact.setEmail("charan@gmail.com");
        contact.setMobile(mobile);
        return contact;
    }

    public static List<Contact> getContacts() {
        Contact contact1 = Contact.builder()
                .name("Yash")
                .email("yash@gmail.com")
                .mobile("9876543210")
                .build();
        Contact contact2 = Contact.builder()
                .name("Manoj")
                .email("manoj.pvn@gmail.com")
                .mobile("9876543211")
                .build();
        return List.of(contact1, contact2);
    }
}
