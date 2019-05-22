package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.AccessoriesException;
import com.project.db.projectDB.model.Accessories;
import com.project.db.projectDB.payload.AccessoriesRequestDTO;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.repository.AccessoriesRepository;
import com.project.db.projectDB.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AccessoriesServiceImpl implements AccessoriesService {

    @Autowired
    private AccessoriesRepository accessoriesRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Accessories> getAllAccessories() {
        return accessoriesRepository.getAccessories();
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public ResponseEntity deleteAccessories(Long id) throws AccessoriesException {
        try {
            transactionRepository.prepareTransactionsForAccessoriesDeletion(id);
            accessoriesRepository.deleteAccessoriesById(id);
            return new ResponseEntity<>(new ApiResponse<>(null, "Accessories deleted successfully."), HttpStatus.OK);
        }catch (Exception e){
            throw new AccessoriesException(e.getMessage());
        }
    }

    @Override
    public void addAccessories(AccessoriesRequestDTO accessoriesRequestDTO) {
        Accessories accessories = new Accessories();
        accessories.setName(accessoriesRequestDTO.getName());
        accessories.setPrice(accessoriesRequestDTO.getPrice());
        accessoriesRepository.save(accessories);
    }

}
