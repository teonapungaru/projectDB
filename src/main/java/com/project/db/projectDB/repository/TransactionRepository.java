package com.project.db.projectDB.repository;

import com.project.db.projectDB.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    //se poate apela metoda findAll
    @Query(value = "SELECT * FROM transactions", nativeQuery = true)
    List<Transaction> getTransactions();

}
