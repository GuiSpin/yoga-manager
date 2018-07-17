package com.api.guispin.yogamanager.domain;

import com.api.guispin.yogamanager.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {

    private String ddd;
    private String telefone;
    private TipoTelefone tipoTelefone;
}
