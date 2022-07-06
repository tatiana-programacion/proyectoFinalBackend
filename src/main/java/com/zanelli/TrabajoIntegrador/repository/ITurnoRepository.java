package com.zanelli.TrabajoIntegrador.repository;
import com.zanelli.TrabajoIntegrador.models.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long>{

}
