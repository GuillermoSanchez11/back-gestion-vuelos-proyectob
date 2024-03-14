package com.edu.udea.airline.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FlightsDTO {
    private Long id;
    private String flightNumber;
    private double basePrice;
    private double taxPercentage;
    private double surcharge;
    private List<ScaleDTO> scales;

}
