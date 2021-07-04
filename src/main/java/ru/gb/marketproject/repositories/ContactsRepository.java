package ru.gb.marketproject.repositories;

import org.springframework.stereotype.Repository;
import ru.gb.marketproject.module.Contact;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ContactsRepository {
    private List<Contact> contactList;

    public List<Contact> getContactsList() {
        return Collections.unmodifiableList(contactList);
    }

    public Contact getContact(Contact contact) {
        contactList.stream()
                .filter(c -> c.equals(contact))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No contact"));

        throw new RuntimeException("No contact");
    }

    public void addContact(String surname, String name, String middleName, long phoneNumber) {
        contactList.add(new Contact(surname, name, middleName, phoneNumber));
    }

    @PostConstruct
    public void init() {
        contactList = new ArrayList<>();
        contactList.add(new Contact("Ivanov", "Ivan", "Ivanovich", 89111111111L));
        contactList.add(new Contact("Petrov", "Petr", "Petrovich", 89111111112L));
    }
}

