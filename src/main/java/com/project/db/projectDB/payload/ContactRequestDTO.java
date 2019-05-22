package com.project.db.projectDB.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactRequestDTO {

    private String city;
    private String street;
    private String phoneNo;
}
