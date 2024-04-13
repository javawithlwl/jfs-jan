package com.careerit.cbook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ComponentScan(basePackages = "com.careerit.cbook")
public class ContactBookManager {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContactBookManager.class);
        ContactDao contactDao = context.getBean(ContactDao.class);

        //Add Contact
       /* Contact contact = new Contact();
        contact.setName("John");
        contact.setMobile("9999999999");
        contact.setCity("Hyderabad");
        Contact savedContact = contactDao.insertContact(contact);
        System.out.println("Contact saved with id : "+savedContact.getId());*/

        // Select all contacts
        /*contactDao.selectContacts().forEach(ele->{
            System.out.println(ele.getId()+" "+ele.getName()+" "+ele.getMobile()+" "+ele.getCity());
        });*/

        // select contact by id
        Contact contact = contactDao.selectContact(2);
        System.out.println(contact);

        // Update contact
        contact.setCity("Bangalore");
        Contact updatedContact = contactDao.updateContact(contact);
        System.out.println(updatedContact.getId()+" "+updatedContact.getName()+" "+updatedContact.getMobile()+" "+updatedContact.getCity());


        List<Contact> contacts = contactDao.search("raj");
        contacts.forEach(ele->{
            System.out.println(ele.getId()+" "+ele.getName()+" "+ele.getMobile()+" "+ele.getCity());
        });

        List<Contact> contactList = new ArrayList<>();
        Contact contact1 = new Contact();
        contact1.setName("Raj");
        contact1.setMobile("9999999999");
        contact1.setCity("Hyderabad");

        Contact contact2 = new Contact();
        contact2.setName("Rajani");
        contact2.setMobile("9999999998");
        contact2.setCity("Hyderabad");

        contactList.add(contact1);
        contactList.add(contact2);

        int[] count = contactDao.insertContacts(contactList);
        System.out.println(Arrays.toString(count));


    }
}
