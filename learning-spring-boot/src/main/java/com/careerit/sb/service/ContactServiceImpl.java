package com.careerit.sb.service;

import com.careerit.sb.dao.ContactDao;
import com.careerit.sb.domain.Contact;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContactServiceImpl implements ContactService {

    private final ContactDao contactDao;
    @Override
    public List<Contact> getContacts() {
        List<Contact> contacts = contactDao.selectContacts();
        log.info("Total contacts found : {}",contacts.size());
        return contacts;
    }

    public Contact addContact(Contact contact){
        Assert.notNull(contact,"Contact should not be null");
        Assert.notNull(contact.getName(),"Name should not be null");
        Assert.notNull(contact.getMobile(),"Mobile should not be null");
        Contact savedContact =  contactDao.insertContact(contact);
        log.info("Contact saved with id : {}",savedContact.getId());
        return savedContact;
    }
}
