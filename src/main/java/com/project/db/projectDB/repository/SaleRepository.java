package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Instant;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Modifying
    @Query(value = "UPDATE sales SET customer_id = null WHERE customer_id=:customer_id", nativeQuery = true)
    void prepareSaleForCustomerDeletion(@Param("customer_id") Long customer_id);

    @Query(value = "SELECT id FROM sales", nativeQuery = true)
    List<Long> getIdsSales();

    @Query(value = "SELECT acquisition_date FROM sales WHERE id=:id", nativeQuery = true)
    Instant getObjectPropertiesById(@Param("id") Long id);
}
