package com.zanelli.TrabajoIntegrador.models;

import lombok.*;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="Turnos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Turno {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="odontologo_id", nullable = false)
    private Odontologo odontologo;

    private LocalDate fechaTurno;
}
