package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.AccessoriesException;
import com.project.db.projectDB.model.Accessories;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.service.AccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    @DeleteMapping(AccessoriesController.API_NAME)
    public ResponseEntity deleteAccessories(@RequestParam ("id") Long id) throws AccessoriesException{
        return accessoriesService.deleteAccessories(id);
    }



}
