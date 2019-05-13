package com.project.db.projectDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer quantity;
    private Instant acquisitionDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sale", orphanRemoval = true)
    private List<Car> cars = new ArrayList<>();

    @ManyToOne
    private Customer customer;
}