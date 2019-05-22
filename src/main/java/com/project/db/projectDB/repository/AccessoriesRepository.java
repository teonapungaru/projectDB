package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Accessories;
import com.project.db.projectDB.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccessoriesRepository extends JpaRepository<Accessories, Long> {

    @Query(value = "SELECT * FROM accessories WHERE name=:name", nativeQuery = true)
    Optional<Accessories> getAccessoriesByName(@Param("name") String name);

    @Query(value = "SELECT * FROM accessories", nativeQuery = true)
    List<Accessories> getAccessories();

    @Modifying
    @Query(value = "DELETE FROM accessories WHERE id=:accessories_id", nativeQuery = true)
    void deleteAccessoriesById(@Param("accessories_id") Long accessories_id);

}
