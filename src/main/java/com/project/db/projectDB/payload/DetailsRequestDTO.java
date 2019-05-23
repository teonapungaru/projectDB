package com.project.db.projectDB.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailsRequestDTO {

    private String lastName;
    private String firstName;
    private String city;
    private String street;
    private String phoneNo;
}
