package com.careerit.jfs.cbook;

import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {
        ContactService service = new ContactService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("#".repeat(30)+"Contact Manager"+"#".repeat(30));
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Update Email");
            System.out.println("4. Update Mobile");
            System.out.println("5. Show Contact Details");
            System.out.println("6. Show All Contacts");
            System.out.println("7. Search");
            System.out.println("8. Exit");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the name : ");
                    String name = sc.next();
                    System.out.println("Enter the email : ");
                    String email = sc.next();
                    System.out.println("Enter the mobile : ");
                    String mobile = sc.next();
                    Contact contact = new Contact(name, email, mobile);
                    service.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the contact id : ");
                    String cid = sc.next();
                    service.deleteContact(cid);
                    break;
                case 3:
                    System.out.println("Enter the contact id : ");
                    String cid1 = sc.next();
                    System.out.println("Enter the email : ");
                    String email1 = sc.next();
                    service.updateEmail(cid1, email1);
                    break;
                case 4:
                    System.out.println("Enter the contact id : ");
                    String cid2 = sc.next();
                    System.out.println("Enter the mobile : ");
                    String mobile1 = sc.next();
                    service.updateMobile(cid2, mobile1);
                    break;
                case 5:
                    System.out.println("Enter the contact id : ");
                    String cid3 = sc.next();
                    service.showContactDetails(cid3);
                    break;
                case 6:
                    service.showAllContacts();
                    break;
                case 7:
                    System.out.println("Enter the string to search :");
                    String search = sc.next();
                    service.search(search);
                    break;
                case 8:
                    System.exit(0);
            }
        }

    }
}
