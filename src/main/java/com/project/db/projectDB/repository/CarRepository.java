package com.project.db.projectDB.repository;

import com.amazonaws.services.elastictranscoder.model.ListPipelinesResult;
import com.project.db.projectDB.model.Accessories;
import com.project.db.projectDB.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT * FROM cars", nativeQuery = true)
    List<Car> getAllCars();

    @Query(value = "SELECT * FROM cars WHERE sale_id=:sale_id", nativeQuery = true)
    List<Car> getCarPerSale(@Param("sale_id") Long sale_id);

    @Modifying
    @Query(value = "UPDATE cars SET sale_id = null WHERE id=:sale_id", nativeQuery = true)
    void prepareSaleForCarDeletion(@Param("sale_id") Long sale_id);

    @Modifying
    @Query(value = "DELETE FROM cars WHERE id=:car_id", nativeQuery = true)
    void deleteCarById(@Param("car_id") Long car_id);
}
