package ru.gb.marketproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.marketproject.module.Contact;
import ru.gb.marketproject.repositories.ContactsRepository;

import java.util.List;

@Service
public class ContactsService {
    private ContactsRepository contactsRepository;

    @Autowired
    public void setContactsRepository(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public List<Contact> getContactsList() {
        return contactsRepository.getContactsList();
    }

    public Contact getContact(Contact contact) {
        return contactsRepository.getContact(contact);
    }

    public void addContact(String surname, String name, String middleName, Long phoneNumber) {
        contactsRepository.addContact(surname, name, middleName, phoneNumber);
    }

}
