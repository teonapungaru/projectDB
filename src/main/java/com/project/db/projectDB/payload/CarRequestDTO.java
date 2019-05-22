package com.project.db.projectDB.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRequestDTO {

    private String model;
    private Float engine;
    private Integer horsePower;
    private String fuelType;
    private Float price;

}
