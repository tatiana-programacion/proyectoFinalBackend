package com.zanelli.TrabajoIntegrador.models;

import lombok.*;

import java.util.*;

//@Entity
//@Table(name="Odontologo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Odontologo {

    private Long id;
    private String nombre;
    private String apellido;
    private int matricula;

    private Set<Turno> turnos;


}
