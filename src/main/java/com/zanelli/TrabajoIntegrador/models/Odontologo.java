package com.zanelli.TrabajoIntegrador.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.*;
import javax.persistence.*;


@Entity
@Table(name="Odontologos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Odontologo {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int matricula;


    @OneToMany(mappedBy = "odontologo")
    @JsonIgnore
    private Set<Turno> turnos;


}
