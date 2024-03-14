package com.edu.udea.airline.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AirplaneModelDTO {
    private String id;
    private String family;
    private double number;
    private double cargoCapacity;

}
