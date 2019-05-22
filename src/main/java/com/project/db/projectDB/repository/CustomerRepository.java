package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Modifying
    @Query(value = "INSERT INTO customers(first_name, last_name) values (:first_name, :last_name)", nativeQuery = true)
    Integer insertUser(@Param("first_name") String first_name, @Param("last_name") String last_name);

    @Modifying
    @Query(value = "DELETE FROM customers WHERE id=:customer_id", nativeQuery = true)
    void deleteCustomer(@Param("customer_id") Long id);

}
