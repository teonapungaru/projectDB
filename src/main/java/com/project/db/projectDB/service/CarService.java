package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.CarException;
import com.project.db.projectDB.exception.ContactException;
import com.project.db.projectDB.model.Car;
import com.project.db.projectDB.payload.CarRequestDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    ResponseEntity deleteCar(Long id) throws CarException;

    void addCar(CarRequestDTO carRequestDTO);

}
