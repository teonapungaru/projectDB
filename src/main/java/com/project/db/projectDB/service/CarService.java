package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.CarException;
import com.project.db.projectDB.exception.ContactException;
import com.project.db.projectDB.model.Car;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    ResponseEntity deleteCar(Long id) throws CarException;
}
