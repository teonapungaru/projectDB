package com.project.db.projectDB.service;


import com.project.db.projectDB.exception.ContactException;
import com.project.db.projectDB.exception.CustomerException;
import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.ContactRequestDTO;
import com.project.db.projectDB.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public ResponseEntity deleteContact(Long id) throws ContactException {
        try{

            return new ResponseEntity<>(new ApiResponse<>(null, "Contact deleted successfully."), HttpStatus.OK);
        } catch (Exception e){
            throw new ContactException(e.getMessage());
        }
    }
}
