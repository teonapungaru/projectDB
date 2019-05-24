package com.project.db.projectDB.service;

import com.amazonaws.services.elastictranscoder.model.ListPipelinesResult;
import com.project.db.projectDB.exception.CarException;
import com.project.db.projectDB.model.Car;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.payload.CarRequestDTO;
import com.project.db.projectDB.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    @Override
    @Transactional
    public ResponseEntity deleteCar(Long id) throws CarException {
        try {
            carRepository.prepareSaleForCarDeletion(id);
            carRepository.deleteCarById(id);
            return new ResponseEntity<>(new ApiResponse<>(null, "Car deleted successfully."), HttpStatus.OK);
        } catch (Exception e) {
            throw new CarException(e.getMessage());
        }
    }

    @Override
    public void addCar(CarRequestDTO carRequestDTO) {
        Car car = new Car();
        car.setModel(carRequestDTO.getModel());
        car.setEngine(carRequestDTO.getEngine());
        car.setHorsePower(carRequestDTO.getHorsePower());
        car.setFuelType(carRequestDTO.getFuelType());
        car.setPrice(carRequestDTO.getPrice());
        carRepository.save(car);
    }
}
