package com.project.db.projectDB.service;

import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.model.Customer;
import com.project.db.projectDB.payload.DetailsRequestDTO;
import com.project.db.projectDB.repository.ContactRepository;
import com.project.db.projectDB.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;


@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class DetailsServiceImpl implements DetailsService {

    private CustomerRepository customerRepository;
    private ContactRepository contactRepository;



    @Override
    @Transactional
    public void addDetailsCustomer(DetailsRequestDTO detailsRequestDTO) {
        Long id = customerRepository.getLastId() + 1L;
        customerRepository.insertUser(detailsRequestDTO.getFirstName(), detailsRequestDTO.getLastName());
        contactRepository.insertContact(detailsRequestDTO.getCity(), detailsRequestDTO.getStreet(), detailsRequestDTO.getPhoneNo(), id);

    }
}
