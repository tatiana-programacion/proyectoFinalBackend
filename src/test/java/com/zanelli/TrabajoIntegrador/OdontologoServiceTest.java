package com.zanelli.TrabajoIntegrador;


import com.zanelli.TrabajoIntegrador.models.OdontologoDTO;
import com.zanelli.TrabajoIntegrador.services.IOdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private IOdontologoService odontologoService;

    @Test
    public void testCrearOdontologo(){
        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setNombre("Juan");
        odontologoDTO.setApellido("Perez");
        odontologoService.crearOdontologo(odontologoDTO);

        OdontologoDTO odontologoPerez = odontologoService.leerOdontologo(1L);

        assertTrue(odontologoPerez != null);

    }

}