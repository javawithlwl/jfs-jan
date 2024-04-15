package com.careerit.sb.web;

import com.careerit.sb.domain.Contact;
import com.careerit.sb.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;
    @GetMapping("/all")
    public ResponseEntity<List<Contact>> getContacts(){
        List<Contact> contacts = contactService.getContacts();
        return ResponseEntity.ok(contacts);
    }

    @PostMapping("/add")
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
        return ResponseEntity.ok(contactService.addContact(contact));
    }
}
