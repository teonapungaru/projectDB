package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Modifying
    @Query(value = "UPDATE cars SET sale_id = null WHERE id=:sale_id", nativeQuery = true)
    void prepareSaleForCarDeletion(@Param("sale_id") Long sale_id);

    @Modifying
    @Query(value = "DELETE FROM cars WHERE id=:car_id", nativeQuery = true)
    void deleteCarById(@Param("car_id") Long car_id);
}
