package com.project.db.projectDB.api;

import com.project.db.projectDB.exception.CarException;
import com.project.db.projectDB.model.Car;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.CarRequestDTO;
import com.project.db.projectDB.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarController extends GeneralProjectController {
    private final static String API_NAME="/cars";

    @Autowired
    private CarService carService;

    @GetMapping(CarController.API_NAME)
    public ResponseEntity<ApiResponse<List<Car>>>getAllCars(){
        List<Car> cars  = carService.getAllCars();
        return new ResponseEntity<>(new ApiResponse<>(cars), HttpStatus.OK);
    }

    @PostMapping(CarController.API_NAME)
    public ResponseEntity<ApiResponse<String>> addCar(@Valid @RequestBody CarRequestDTO carRequestDTO){
        carService.addCar(carRequestDTO);
        return new ResponseEntity<>(new ApiResponse<>("Car added successfully!"), HttpStatus.OK);
    }


    @DeleteMapping(CarController.API_NAME)
    public ResponseEntity deleteCar(@RequestParam("id") Long id) throws CarException{
        return carService.deleteCar(id);
    }

}
