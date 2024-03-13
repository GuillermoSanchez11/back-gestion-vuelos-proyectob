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
public class Airport implements Serializable {
    @Id
    private Long id;
    private String name;
    private String type;
    private String city;
    private String country;
    private String runways;


}
