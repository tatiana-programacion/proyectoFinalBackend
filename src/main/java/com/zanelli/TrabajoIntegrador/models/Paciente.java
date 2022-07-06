package com.zanelli.TrabajoIntegrador.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Pacientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Paciente {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int dni;
    private LocalDate fechaAlta;

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<Turno> turnos;

}
