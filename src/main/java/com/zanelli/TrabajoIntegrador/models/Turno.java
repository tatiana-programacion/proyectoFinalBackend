package com.zanelli.TrabajoIntegrador.models;

import lombok.*;

import java.time.LocalDate;
//@Entity
//@Table(name="Odontologo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Turno {

    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private LocalDate fechaTurno;
}
