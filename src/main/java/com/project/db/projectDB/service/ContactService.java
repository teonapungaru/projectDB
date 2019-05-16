package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.ContactException;
import com.project.db.projectDB.exception.CustomerException;
import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.model.Sale;
import com.project.db.projectDB.payload.ContactRequestDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    void updateContact(ContactRequestDTO contactRequestDTO);
    ResponseEntity deleteContact(Long id) throws ContactException;
}
