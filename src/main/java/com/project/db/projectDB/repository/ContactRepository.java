package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query(value = "SELECT * FROM contact", nativeQuery = true)
    List<Contact> getContacts();

    @Modifying
    @Query(value = "DELETE FROM contact WHERE phoneNo=:phoneNo", nativeQuery = true)
    void deleteContactByPhoneNo(@Param("phoneNo") String phoneNo);

    @Modifying
    @Query(value = "INSERT INTO contact(city, street, phoneNo) values (:city, :street, :phoneNo)", nativeQuery = true)
    Integer insertContact(@Param("city") String city, @Param("street") String street);
}
