package com.zanelli.TrabajoIntegrador.models;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class TurnoDTO {

    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private LocalDate fechaTurno;
}
