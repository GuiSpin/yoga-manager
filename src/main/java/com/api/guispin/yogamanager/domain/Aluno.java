package com.api.guispin.yogamanager.domain;

import org.springframework.data.annotation.Id;

import javax.annotation.Generated;

public class Aluno {

    @Id
    private String id;
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
