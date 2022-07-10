package com.zanelli.TrabajoIntegrador.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class PacienteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private int dni;

}
