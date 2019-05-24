package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.SalesException;
import com.project.db.projectDB.model.Sale;
import com.project.db.projectDB.payload.SalesRequestDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SalesService {
    List<Sale> getAllSales();
    //ResponseEntity deleteSales(Long id) throws SalesException;

    //void addSales(SalesRequestDTO carRequestDTO);
}
