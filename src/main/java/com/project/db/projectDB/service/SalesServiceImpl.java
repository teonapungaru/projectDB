package com.project.db.projectDB.service;

import com.project.db.projectDB.model.Car;
import com.project.db.projectDB.model.Sale;
import com.project.db.projectDB.model.Sale;
import com.project.db.projectDB.model.Transaction;
import com.project.db.projectDB.repository.CarRepository;
import com.project.db.projectDB.repository.SaleRepository;
import com.project.db.projectDB.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class SalesServiceImpl implements SalesService{

    private SaleRepository saleRepository;
    private CarRepository carRepository;
    private TransactionRepository transactionRepository;

    public List<Sale> getAllSales() {
        List<Long> saleIds = saleRepository.getIdsSales();
        List<Sale> sales= new ArrayList<>();


        for (Long id : saleIds) {
            List<Car> cars= new ArrayList<>();
            List<Transaction> transactions = new ArrayList<>();
            Instant splitAttributes = saleRepository.getObjectPropertiesById(id);
            Sale sale = new Sale();
            sale.setId(id);
            sale.setAcquisitionDate(splitAttributes);

            cars.addAll(carRepository.getCarPerSale(id));
            transactions.addAll(transactionRepository.gettransactionPerSale(id));

            sale.setCars(cars);
            sale.setTransactions(transactions);
            sales.add(sale);
        }
        return sales;
    }
}
