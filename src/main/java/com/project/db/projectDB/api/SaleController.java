package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.SalesException;
import com.project.db.projectDB.model.Sale;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.SalesRequestDTO;
import com.project.db.projectDB.repository.SaleRepository;
import com.project.db.projectDB.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@RestController
public class SaleController extends GeneralProjectController {
    private final static String API_NAME="/sales";

    @Autowired
    private SalesService salesService;

    @Autowired
    private SaleRepository saleRepository;

    @GetMapping(SaleController.API_NAME)
    public ResponseEntity<ApiResponse<List<Sale>>> getAllSales()throws SQLException {
        List<Sale> sales  = salesService.getAllSales();
        return new ResponseEntity<>(new ApiResponse<>(sales), HttpStatus.OK);
    }

//    @PostMapping(SaleController.API_NAME)
//    public ResponseEntity<ApiResponse<String>> addSale(@Valid @RequestBody SalesRequestDTO salesRequestDTO){
//        salesService.addSales(salesRequestDTO);
//        return new ResponseEntity<>(new ApiResponse<>("Sales added successfully!"), HttpStatus.OK);
//    }


//    @DeleteMapping(SaleController.API_NAME)
//    public ResponseEntity deleteSales(@RequestParam("id") Long id) throws SalesException {
//        return salesService.deleteSales(id);
//    }

}
