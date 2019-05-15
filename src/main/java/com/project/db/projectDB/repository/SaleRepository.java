package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query(value = "SELECT * FROM sale", nativeQuery = true)
    List<Sale> getSales();
}
