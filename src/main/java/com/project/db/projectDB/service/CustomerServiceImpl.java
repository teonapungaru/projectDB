package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.CustomerException;
import com.project.db.projectDB.model.Customer;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.repository.ContactRepository;
import com.project.db.projectDB.repository.CustomerRepository;
import com.project.db.projectDB.repository.SaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;
    private ContactRepository contactRepository;
    private SaleRepository saleRepository;

    @Override
    public List<Customer> getAllCustomers() {

        List<Long> customerIds = customerRepository.getIds();
        List<Customer> customers= new ArrayList<>();
        for (Long id : customerIds) {
            String[] splitAttributes = customerRepository.getObjectPropertiesById(id).split(",");
            Customer customer = new Customer();
            customer.setId(id);
            customer.setFirstName(splitAttributes[0]);
            customer.setLastName(splitAttributes[1]);

            customers.add(customer);
        }

        return customers;
    }

    @Override
    @Transactional
    public ResponseEntity deleteCustomer(Long id) throws CustomerException {
        try{
            contactRepository.deleteContactById(id);
            saleRepository.prepareSaleForCustomerDeletion(id);
            customerRepository.deleteCustomer(id);
            return new ResponseEntity<>(new ApiResponse<>(null, "Customer deleted successfully."), HttpStatus.OK);
        } catch (Exception e){
            throw new CustomerException(e.getMessage());
        }
    }

}
