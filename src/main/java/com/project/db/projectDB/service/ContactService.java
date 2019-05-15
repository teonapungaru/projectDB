package com.project.db.projectDB.service;

import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.model.Sale;
import com.project.db.projectDB.payload.ContactRequestDTO;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    void updateContact(ContactRequestDTO contactRequestDTO);
}
