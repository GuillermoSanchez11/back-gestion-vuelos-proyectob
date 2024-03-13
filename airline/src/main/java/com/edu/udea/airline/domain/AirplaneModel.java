package com.edu.udea.airline.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Data
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class AirplaneModel implements Serializable {
    @Id
    private Long id;
    private String family;
    private double number;
    private double cargoCapacity;
}
