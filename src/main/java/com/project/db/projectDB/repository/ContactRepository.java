package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Contact;
import com.project.db.projectDB.payload.ContactRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query(value = "SELECT * FROM contacts", nativeQuery = true)
    Contact getContactById(@Param("customer_id") Long customer_id);

    @Query(value = "SELECT phone_no FROM contacts WHERE customer_id=:customer_id ", nativeQuery = true)
    String getPhoneNo(@Param("customer_id") Long customer_id);

    @Modifying
    @Query(value = "DELETE FROM contacts WHERE id=:contact_id", nativeQuery = true)
    void deleteContactById(@Param("contact_id") Long customer_id);

    @Modifying
    @Query(value = "INSERT INTO contacts(city, street, phone_no) values (:city, :street, :phone_no)", nativeQuery = true)
    Integer insertContact(@Param("city") String city, @Param("street") String street);

    @Modifying
    @Query(value = "UPDATE contacts SET customer_id = null WHERE customer_id=:customer_id", nativeQuery = true)
    void prepareCustomerForContactDeletion(@Param("customer_id") Long customer_id);

}
