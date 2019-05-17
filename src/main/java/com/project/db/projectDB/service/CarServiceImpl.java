package com.project.db.projectDB.service;

import com.project.db.projectDB.exception.CarException;
import com.project.db.projectDB.model.Car;
import com.project.db.projectDB.payload.ApiResponse;
import com.project.db.projectDB.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @Override
    public ResponseEntity deleteCar(Long id) throws CarException {
        try{
            carRepository.prepareSaleForCarDeletion(id);
            carRepository.deleteCarById(id);
            return new ResponseEntity<>(new ApiResponse<>(null, "Car deleted successfully."), HttpStatus.OK);
        }catch (Exception e){
            throw new CarException(e.getMessage());
        }
    }
}
