package com.zanelli.TrabajoIntegrador.models;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

//@Entity
//@Table(name="Odontologo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Paciente {

    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int dni;
    private LocalDate fechaAlta;

    private Set<Turno> turnos;

}
