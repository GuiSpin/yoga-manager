package com.api.guispin.yogamanager.domain;

import com.api.guispin.yogamanager.enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private Tipo tipo;
    private String logradouro;
    private String numero;
    private String complemento;
    private String Bairro;
    private String Cidade;
    private String numeroCEP;

}
