package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Modifying
    @Query(value = "UPDATE transactions SET accessories_id = null WHERE accessories_id=:accessories_id", nativeQuery = true )
    void prepareTransactionsForAccessoriesDeletion(@Param("accessories_id") Long accessories_id);
}
