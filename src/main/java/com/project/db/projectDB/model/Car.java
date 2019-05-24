package com.project.db.projectDB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String model;

    @NotNull
    private Float engine;

    @NotNull
    private Integer horsePower;

    @NotBlank
    private String fuelType;

    @NotNull
    private Float price;

    private String image;

    @JsonIgnore
    @ManyToOne
    @Nullable
    private Sale sale;

}
