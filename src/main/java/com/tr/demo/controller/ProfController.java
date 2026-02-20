package com.tr.demo.controller;

import com.tr.demo.models.AlunoModel;
import com.tr.demo.models.ProfModel;
import com.tr.demo.services.AlunoService;
import com.tr.demo.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/schools/prof")

public class ProfController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<ProfModel> findAll(){
        return professorService.findAll();
    }

}
