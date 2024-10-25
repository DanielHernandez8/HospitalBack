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
    public Paciente getPacienteById (@PathVariable("id")Integer id){
       return pacienteRepository.findPacienteById(id);
    }

    @PostMapping("/")
    public void createPeople(@RequestBody Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @DeleteMapping("/{id}")
    public void deletePeople(@PathVariable("id") Integer id) {
        Paciente i = new Paciente();
        i.setId(id);
        pacienteRepository.delete(i);
    }

    @PutMapping("/{id}")
    public void updatePeople(@RequestBody Paciente person, @PathVariable("id")Integer id) {
        person.setId(id);
        pacienteRepository.save(person);
    }

}
