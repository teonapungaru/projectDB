package com.project.db.projectDB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String city;
    private String street;

    @NotBlank
    @Column(unique = true)
    private String phoneNo;


    @OneToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = true, name = "customer_id")
    private Customer customer;
}
