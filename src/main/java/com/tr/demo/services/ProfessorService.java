package com.tr.demo.services;

import com.tr.demo.models.AlunoModel;
import com.tr.demo.models.ProfModel;
import com.tr.demo.repositories.AlunoRepository;
import com.tr.demo.repositories.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfRepository profRepository;

    public List<ProfModel> findAll(){
        return profRepository.findAll();
    }
}
