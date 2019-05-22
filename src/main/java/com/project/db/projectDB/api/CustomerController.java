package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.CustomerException;
import com.project.db.projectDB.model.Customer;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.CustomerRequestDTO;
import com.project.db.projectDB.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@RestController
public class CustomerController extends GeneralProjectController {
    private static final String API_NAME = "/customers";

    @Autowired
    private CustomerService customerService;


    @GetMapping(CustomerController.API_NAME)
    public ResponseEntity<ApiResponse<List<Customer>>> getAllCustomers() throws SQLException {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(new ApiResponse<>(customers), HttpStatus.OK);
    }

    @PostMapping(CustomerController.API_NAME)
    public ResponseEntity<ApiResponse<String>> addCustomer (@Valid @RequestBody CustomerRequestDTO customerRequestDTO){
        customerService.addCustomer(customerRequestDTO);
        return new ResponseEntity<>(new ApiResponse<>("Customer added successfully!"), HttpStatus.OK);
    }

    @DeleteMapping(CustomerController.API_NAME)
    public ResponseEntity deleteCustomer(@RequestParam("id")Long id) throws CustomerException {
        return customerService.deleteCustomer(id);
    }

}

