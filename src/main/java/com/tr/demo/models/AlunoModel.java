package com.tr.demo.models;

import jakarta.persistence.*;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity //cria entidade no banco
@Table(name = "TBL_ALUNO") //adiciona um nome personalizado no nome da tabela

public class AlunoModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY ) //gera o id automaticamente
    private Long id;
    //cria atributo nome no banco
    private String nome;
    private String cpf;
    private String email;

    public AlunoModel() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
