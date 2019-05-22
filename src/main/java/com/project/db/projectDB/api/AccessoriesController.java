package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.AccessoriesException;
import com.project.db.projectDB.model.Accessories;
import com.project.db.projectDB.payload.AccessoriesRequestDTO;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.CarRequestDTO;
import com.project.db.projectDB.service.AccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccessoriesController extends  GeneralProjectController{
    private final static String API_NAME = "/accessories";

    @Autowired
    private AccessoriesService accessoriesService;

    @GetMapping(AccessoriesController.API_NAME)
    public ResponseEntity<ApiResponse<List<Accessories>>>getAllAccessories(){
        List<Accessories> accessories = accessoriesService.getAllAccessories();
        return new ResponseEntity<>(new ApiResponse<>(accessories), HttpStatus.OK);
    }

    @PostMapping(AccessoriesController.API_NAME)
    public ResponseEntity<ApiResponse<String>> addAccessories(@Valid @RequestBody AccessoriesRequestDTO accessoriesRequestDTO){
        accessoriesService.addAccessories(accessoriesRequestDTO);
        return new ResponseEntity<>(new ApiResponse<>("Accessories added successfully!"), HttpStatus.OK);
    }

    @DeleteMapping(AccessoriesController.API_NAME)
    public ResponseEntity deleteAccessories(@RequestParam ("id") Long id) throws AccessoriesException{
        return accessoriesService.deleteAccessories(id);
    }



}
