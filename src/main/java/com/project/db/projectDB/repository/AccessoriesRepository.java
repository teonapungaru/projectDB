package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Accessories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccessoriesRepository {

    @Query(value = "SELECT * FROM accessories WHERE id=:id", nativeQuery = true)
    Optional<Accessories> getAccessoriesById(@Param("id") Long id);

    @Query(value = "SELECT * FROM accessories WHERE name=:name", nativeQuery = true)
    Optional<Accessories> getAccessoriesByName(@Param("name") String name);
}
