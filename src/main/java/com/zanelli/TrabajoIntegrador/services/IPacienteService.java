package com.zanelli.TrabajoIntegrador.services;

import com.zanelli.TrabajoIntegrador.models.Paciente;
import com.zanelli.TrabajoIntegrador.models.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    void crearPaciente(PacienteDTO pacienteDTO);
    PacienteDTO leerPaciente(Long id);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Long id);
    Set<PacienteDTO> getTodos();
}
