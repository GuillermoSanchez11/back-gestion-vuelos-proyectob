package com.edu.udea.airline.domain.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class ScalesDTO {
    private Long id;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate departureDate;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate arrivalDate;

}
