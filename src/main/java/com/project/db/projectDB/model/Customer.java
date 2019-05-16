package com.project.db.projectDB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @NotBlank
    private String lastName;

    @NotBlank
    private String firstName;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", orphanRemoval = true)
    private List<Sale> sales = new ArrayList<>();
}
