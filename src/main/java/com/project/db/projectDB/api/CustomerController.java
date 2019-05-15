package com.project.db.projectDB.api;

import com.project.db.projectDB.model.Customer;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController extends GeneralProjectController {
    private static final String API_NAME = "/customers";

    @Autowired
    private CustomerService customerService;

    @GetMapping(CustomerController.API_NAME)
    public ResponseEntity<ApiResponse<List<Customer>>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(new ApiResponse<>(customers), HttpStatus.OK);
    }
}

