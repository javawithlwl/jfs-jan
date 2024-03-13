package com.careerit.jfs.collections;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
class Contact{
    private String name;
    private String email;
    private String mobile;
}
interface ContactService{
    public void addContact(Contact contact);
    public void removeContact(String name);
    public void updateMobile(String email, String mobile);
    public void showContact(String name);
    public void showContacts();
}

class ContactServiceImpl implements ContactService{

    private List<Contact> contacts = new ArrayList<>();
    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
        // validate if email is already exists, you should not add the contact
        System.out.println("Contact added successfully");
    }
    @Override
    public void removeContact(String name) {
        int index = indexOfName(name);
        if(index == -1){
            System.out.println("Contact not found");
            return;
        }else{
            contacts.remove(index);
            System.out.println("Contact removed successfully");
        }
    }
    @Override
    public void updateMobile(String email,String mobile) {
    }
    @Override
    public void showContact(String name) {
        int index = indexOfName(name);
        if(index == -1) {
            System.out.println("Contact not found");
        }else{
            Contact contact = contacts.get(index);
            System.out.println("Name   : "+contact.getName());
            System.out.println("Email  : "+contact.getEmail());
            System.out.println("Mobile : "+contact.getMobile());
        }
    }
    @Override
    public void showContacts() {
    }

    private int indexOfName(String name){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}

public class ContactManager {

    public static void main(String[] args) {

        ContactService contactService = new ContactServiceImpl();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Update contact");
            System.out.println("4. Show contact");
            System.out.println("5. Show all contacts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the name :");
                    String name = sc.next();
                    System.out.println("Enter the email :");
                    String email = sc.next();
                    System.out.println("Enter the mobile :");
                    String mobile = sc.next();
                    Contact contact = new Contact();
                    contact.setName(name);
                    contact.setEmail(email);
                    contact.setMobile(mobile);
                    contactService.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the name :");
                    String rname = sc.next();
                    contactService.removeContact(rname);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Enter the name :");
                    String sname = sc.next();
                    contactService.showContact(sname);
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
