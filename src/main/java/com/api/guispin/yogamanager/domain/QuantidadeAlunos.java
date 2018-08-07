package com.api.guispin.yogamanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuantidadeAlunos {

    private Integer quantidadeTotal;
    private Integer quantidadeReposicao;
    private Integer quantidadeExperimental;

}
