package com.edu.udea.airline.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Scale {
    @Id
    private Long id;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate departureDate;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate arrivalDate;

}
