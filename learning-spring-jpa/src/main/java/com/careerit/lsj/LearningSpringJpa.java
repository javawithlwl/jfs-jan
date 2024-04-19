package com.careerit.lsj;

import com.careerit.lsj.cbook.Contact;
import com.careerit.lsj.cbook.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LearningSpringJpa implements CommandLineRunner {

    @Autowired
    private ContactRepo contactRepo;

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringJpa.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Contact contact = new Contact();
        contact.setName("Krish");
        contact.setEmail("krish@gmail.com");
        contact.setMobile("9876543210");

        Contact newContact = contactRepo.save(contact);
        System.out.println("Contact saved : "+newContact.getCid());

        contactRepo.findAll().forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });

        /*Optional<Contact> optContact =  contactRepo.findById(UUID.fromString("46d386a0-2923-4f12-a602-e1263350540e"));
        if(optContact.isPresent()) {
            Contact contact = optContact.get();
            System.out.println(contact.getCid() + " : " + contact.getName() + " : " + contact.getEmail() + " : " + contact.getMobile());
        }else{
            System.out.println("Contact not found");
        }*/

        /*Optional<Contact> optContact =  contactRepo.findById(UUID.fromString("46d386a0-2923-4f12-a602-e1263350540e"));
        if(optContact.isPresent()) {
            Contact contact = optContact.get();
            contact.setName("Krishna");
            contact.setEmail("krishna.t@wipro.com");
            contactRepo.save(contact);
        }else{
            System.out.println("Contact not found");
        }*/

        List<Contact> contactList = List.of(new Contact("Charan", "charan@gmail.com", "9876543210"),
                new Contact("Manoj", "manoj.pvn@gmail.com", "9876543211"),
                new Contact("Rajesh", "rajesh@gmail.com", "9876543212"),
                new Contact("Sai", "sai@yahoo.com", "9876543213"));

        /*System.out.println("----------------- Saving multiple contacts -------------------");
        List<Contact> savedContacts = contactRepo.saveAll(contactList);
        savedContacts.forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });*/

        /*System.out.println("----------------- Find all contacts -------------------");
        List<Contact> contacts = contactRepo.findAll();
        contacts.forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });*/

        // Delete contact by id if exists

        /*contactRepo.deleteById(UUID.fromString("46d386a0-2923-4f12-a602-e1263350540e"));*/

        // Get all contact which has email like gmail.com

        List<Contact> searchResultList = contactRepo.findByEmail("gmail.com");

        searchResultList.forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });

    }
}
