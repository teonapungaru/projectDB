package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.CustomerException;
import com.project.db.projectDB.model.Customer;
import com.project.db.projectDB.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public ResponseEntity deleteCustomer(Long id) throws CustomerException {
        //de bagat cod
        return null;
    }

}
