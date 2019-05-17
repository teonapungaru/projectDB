package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.ContactException;
import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
