package com.project.db.projectDB.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @NotNull
    private Integer quantity;
    private Instant acquisitionDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sale", orphanRemoval = true)
    private List<Car> cars = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sale", orphanRemoval = true)
    private List<Accessories> accessories = new ArrayList<>();

    @JsonIgnore
    @ManyToOne
    @Nullable
    private Customer customer;
}
