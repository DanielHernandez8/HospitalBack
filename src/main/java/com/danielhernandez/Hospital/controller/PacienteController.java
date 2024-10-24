package com.danielhernandez.Hospital.controller;

import com.danielhernandez.Hospital.entities.Paciente;
import com.danielhernandez.Hospital.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/pacientes")
public class PacienteController{
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> getPaciente(){
        List<Paciente> pacientes = pacienteRepository.findAll();
        return pacientes;
    }

    @GetMapping("/{id}")
    public Optional<Paciente> getPacienteById (@PathVariable("id")Integer id){
       return pacienteRepository.findById(id);
    }

}
