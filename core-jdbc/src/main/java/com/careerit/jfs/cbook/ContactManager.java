package com.careerit.jfs.cbook;

import java.util.List;
import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {

        ContactService contactService = new ContactServiceImpl();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("-".repeat(50));
            System.out.println("1. Add Contact");
            System.out.println("2. Update Email");
            System.out.println("3. Update Mobile");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search Contact");
            System.out.println("6. View All Contacts");
            System.out.println("7. Exit");
            System.out.println("-".repeat(50));
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    try {

                        System.out.println("Enter name:");
                        String name = sc.next();
                        System.out.println("Enter email:");
                        String email = sc.next();
                        System.out.println("Enter mobile:");
                        String mobile = sc.next();
                        Contact contact = Contact.builder()
                                .name(name)
                                .email(email)
                                .mobile(mobile)
                                .build();
                        long cid = contactService.addContact(contact);
                        System.out.println("Contact added with id:" + cid);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Enter cid:");
                        long cid = sc.nextLong();
                        System.out.println("Enter email:");
                        String email = sc.next();
                        Contact contact = contactService.updateEmail(cid,email);
                        System.out.println("Contact updated with email:" + contact.getEmail());
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter cid:");
                        long cid = sc.nextLong();
                        System.out.println("Enter mobile:");
                        String mobile = sc.next();
                        Contact contact = contactService.updateMobile(cid, mobile);
                        System.out.println("Contact updated with mobile:" + contact.getMobile());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Enter cid:");
                        long cid = sc.nextLong();
                        boolean isDeleted = contactService.deleteContact(cid);
                        if (isDeleted) {
                            System.out.println("Contact deleted successfully");
                        } else {
                            System.out.println("Contact with given id does not exists");
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Enter search string:");
                        String str = sc.next();
                        List<Contact> list = contactService.search(str);
                        if(list.isEmpty()) {
                            System.out.println("No contacts found");
                        }else {
                            list.forEach(contact->{
                                System.out.println(contact.getCid()+" "+contact.getName()+" "+contact.getEmail()+" "+contact.getMobile());
                            });
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    List<Contact> list = contactService.getAllContacts();
                    if(list.isEmpty()) {
                        System.out.println("No contacts found");
                    }else {
                        list.forEach(contact->{
                            System.out.println(contact.getCid()+" "+contact.getName()+" "+contact.getEmail()+" "+contact.getMobile());
                        });
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
