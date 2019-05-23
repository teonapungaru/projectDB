package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.ContactException;
import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.ContactRequestDTO;
import com.project.db.projectDB.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ContactController extends GeneralProjectController{
    private final static String API_NAME = "/contacts";

    @Autowired
    private ContactService contactService;

    @GetMapping(ContactController.API_NAME)
    public ResponseEntity<ApiResponse<List<Contact>>> getAllContacts(){
        List<Contact> contacts = contactService.getAllContacts();
        return new ResponseEntity<>(new ApiResponse<>(contacts), HttpStatus.OK);
    }

    @DeleteMapping(ContactController.API_NAME)
    public ResponseEntity deleteContact(@RequestParam("id")Long id) throws ContactException {
        return contactService.deleteContact(id);
    }

    @PutMapping(ContactController.API_NAME)
    public ResponseEntity<ApiResponse<String>> updateCustomer(@Valid @RequestBody ContactRequestDTO contactRequestDTO) throws ContactException{
        contactService.updateContact(contactRequestDTO);
        return new ResponseEntity<>(new ApiResponse<>("Contact updated successfully"), HttpStatus.OK);
    }
}
