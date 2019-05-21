package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.AccessoriesException;
import com.project.db.projectDB.model.Accessories;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccessoriesService {
    List<Accessories>getAllAccessories();
    ResponseEntity deleteAccessories(Long id) throws AccessoriesException;

}
