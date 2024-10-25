package com.danielhernandez.Hospital.repository;

import com.danielhernandez.Hospital.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
    Paciente findPacienteById(Integer id);
}
