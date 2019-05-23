package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Modifying
    @Query(value = "INSERT INTO customers(first_name, last_name) values (:first_name, :last_name)", nativeQuery = true)
    Integer insertUser(@Param("first_name") String first_name, @Param("last_name") String last_name);

    @Query(value = "SELECT id FROM customers", nativeQuery = true)
    List<Long> getIds();

    @Query(value = "SELECT first_name, last_name FROM customers WHERE id=:id", nativeQuery = true)
    String getObjectPropertiesById(@Param("id") Long id);

    @Query(value = "SELECT max(id) FROM customers", nativeQuery = true)
    Long getLastId();

    @Modifying
    @Query(value = "DELETE FROM customers WHERE id=:customer_id", nativeQuery = true)
    void deleteCustomer(@Param("customer_id") Long id);

}
