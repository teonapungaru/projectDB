package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT * FROM cars WHERE id=:id", nativeQuery = true)
    Optional<Car> getCarById(@Param("id") Long id);

    @Query(value = "SELECT * FROM cars WHERE model=:model", nativeQuery = true)
    Optional<Car> getCarByModel(@Param("model") String model);
}
