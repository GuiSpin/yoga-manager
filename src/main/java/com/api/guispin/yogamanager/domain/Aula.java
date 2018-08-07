package com.api.guispin.yogamanager.domain;

import com.api.guispin.yogamanager.enums.DiaSemana;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aula {

    @Id
    private String id;
    private String titulo;
    private String descricao;
    private QuantidadeAlunos quantidadeAlunos;
    private DiaSemana diaSemana;
    private Horario horario;

}
