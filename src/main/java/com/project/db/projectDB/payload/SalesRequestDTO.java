package com.project.db.projectDB.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesRequestDTO {
    private Instant acquisitionDate;
}
