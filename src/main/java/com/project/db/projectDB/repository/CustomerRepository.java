package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT max(id) FROM customer", nativeQuery = true)
    Long getLastId();

    @Modifying
    @Query(value = "INSERT INTO customer(first_name, last_name) values (:first_name, :last_name)", nativeQuery = true)
    Integer insertUser(@Param("first_name") String first_name, @Param("last_name") String last_name);

    @Modifying
    @Query(value = "UPDATE customer SET contact_id = null WHERE contact_id=:contact_id", nativeQuery = true)
    void prepareCustomerForContactDeletion(@Param("contact_id") Long contact_id);
}
