package com.tr.demo.services;

import com.tr.demo.models.AlunoModel;
import com.tr.demo.models.EstudanteModel;
import com.tr.demo.models.PessoaModel;
import com.tr.demo.repositories.AlunoRepository;
import com.tr.demo.repositories.EstudanteRepository;
import com.tr.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findall(){
        return  estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }

    public EstudanteModel findEstudanteById(Long id){
        return estudanteRepository.findById(id).get();
    }

}
