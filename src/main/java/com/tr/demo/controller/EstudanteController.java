package com.tr.demo.controller;

import com.tr.demo.models.EstudanteModel;
import com.tr.demo.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/escola/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<EstudanteModel> getEstudante(){
        return estudanteService.findall();
    }

    @GetMapping("/{id}")
    public EstudanteModel getEstudanteById(@PathVariable Long id){
        return estudanteService.findEstudanteById(id);
    }

    @PostMapping
    public EstudanteModel addEstudante(@RequestBody EstudanteModel estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @DeleteMapping("/{id}")
    public void deleteEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }

}
