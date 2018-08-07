package com.api.guispin.yogamanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    private String id;
    private String nome;
    private Endereco endereco;
    private List<Telefone> telefones;
    private String numeroCPF;
    private String numeroRG;
    private String email;
    private LocalDateTime dataCadastro;




}
