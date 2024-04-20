package com.careerit.lsj;

import com.careerit.lsj.cbook.Contact;
import com.careerit.lsj.cbook.ContactRepo;
import com.careerit.lsj.cbook.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class LearningSpringJpa implements CommandLineRunner {

    @Autowired
    private ContactRepo contactRepo;

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringJpa.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Contact contact = new Contact();
        contact.setName("Krish");
        contact.setEmail("krish@gmail.com");
        contact.setMobile("9876543210");

        Contact newContact = contactRepo.save(contact);
        System.out.println("Contact saved : "+newContact.getCid());

        contactRepo.findAll().forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });*/

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

       /* List<Contact> contactList = List.of(new Contact("Charan", "charan@gmail.com", "9876543210"),
                new Contact("Manoj", "manoj.pvn@gmail.com", "9876543211"),
                new Contact("Rajesh", "rajesh@gmail.com", "9876543212"),
                new Contact("Sai", "sai@yahoo.com", "9876543213"));
*/
        /*System.out.println("----------------- Saving multiple contacts -------------------");
        List<Contact> savedContacts = contactRepo.saveAll(contactList);
        savedContacts.forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });*/

        /*System.out.println("----------------- Find all contacts -------------------");*/

        List<Contact> contacts = contactRepo.findAll();
        contacts.forEach(c->{
            System.out.println(c.getId() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile()+" : "+c.getCity()+" : "+c.isDeleted());
        });

        // Delete contact by id if exists

        /*contactRepo.deleteById(UUID.fromString("46d386a0-2923-4f12-a602-e1263350540e"));*/

        // Get all contact which has email like gmail.com

      /*  List<Contact> searchResultList = contactRepo.findByEmail("gmail.com");

        searchResultList.forEach(c->{
            System.out.println(c.getCid() + " : "+c.getName() + " : "+c.getEmail() + " : "+c.getMobile());
        });*/

       /* User user = new User();
        user.setName("Krish");
        user.setEmail("krish.t@gmail.com");
        user.setPassword("krish@12#");

        userRepo.save(user);*/

       /* userRepo.findById(UUID.fromString("08d460c6-5900-46fa-9570-6ab8f9f32df1"))
                .ifPresent(user -> {
                   user.setPassword("krish@123");
                     userRepo.save(user);
                });
*/

        long count = contactRepo.count();
        System.out.println("Total contacts : "+count);

        contactRepo.softDeleteById(UUID.fromString("73928890-bcf8-4388-8359-fef57cccaa39"));
    }
}
