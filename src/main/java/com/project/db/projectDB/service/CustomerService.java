package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.CustomerException;
import com.project.db.projectDB.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    ResponseEntity deleteCustomer(Long id) throws CustomerException;
}