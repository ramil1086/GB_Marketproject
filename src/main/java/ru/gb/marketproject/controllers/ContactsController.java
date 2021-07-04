package ru.gb.marketproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.marketproject.services.ContactsService;

@Controller
public class ContactsController {
    private ContactsService contactsService;

    @Autowired
    public void setContactsService(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping
    public String showContactsList(Model model) {
        model.addAttribute("contactsList", contactsService.getContactsList());
        return "index";
    }

    @GetMapping("/addcontact")
    public String showAddCToContactsListPage(Model model) {
        return "add_contact_form";
    }

    @PostMapping("/addcontact")
    public String addContactToContactsList(@RequestParam String surname, @RequestParam String name, @RequestParam String middleName, @RequestParam long phoneNumber) {
        contactsService.addContact(surname, name, middleName, phoneNumber);
        return "redirect:/";
    }

}