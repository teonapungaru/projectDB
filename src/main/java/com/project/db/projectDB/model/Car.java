package com.project.db.projectDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String model;

    @NotBlank
    private Integer horsePower;

    @NotBlank
    private String fuelType;

    @NotBlank
    private Float price;

    @ManyToOne
    private Sale sale;
}
