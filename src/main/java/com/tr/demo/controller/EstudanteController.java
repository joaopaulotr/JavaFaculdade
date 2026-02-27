package com.tr.demo.controller;

import com.tr.demo.models.EstudanteModel;
import com.tr.demo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/escola/estudante");

public class EstudanteController {

@Autowired
    private EstudanteRepository estudanteRepository;

@GetMapping
public List<EstudanteModel> getEstudante(){
    return estudanteRepository.findAll();
}

@PostMapping
    public EstudanteModel addEstudante(@RequestBody EstudanteModel estudante){
    return estudanteService.criarEstudante(alunoModel);
}

@DeleteMapping("/{id}")
    public void deleteEstudante(@PathVariable int id){
    estudanteService.deletarEsutante(id);
}

}
