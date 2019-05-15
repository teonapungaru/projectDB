package com.project.db.projectDB.service;

import com.project.db.projectDB.model.Car;
import com.project.db.projectDB.payload.ContactRequestDTO;
import com.project.db.projectDB.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
