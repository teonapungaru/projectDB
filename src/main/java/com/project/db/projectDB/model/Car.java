package com.project.db.projectDB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @NotBlank
    private String model;

    @NotBlank
    private Float engine;

    @NotBlank
    private Integer horsePower;

    @NotBlank
    private String fuelType;

    @NotBlank
    private Float price;

    @JsonIgnore
    @ManyToOne
    @Nullable
    private Sale sale;

}
