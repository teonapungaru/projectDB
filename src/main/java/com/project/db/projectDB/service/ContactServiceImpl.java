package com.project.db.projectDB.service;


import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.payload.ContactRequestDTO;
import com.project.db.projectDB.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class ContactServiceImpl implements ContactService{
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public void updateContact(ContactRequestDTO contactRequestDTO) {
        //scrie cod
    }
}
