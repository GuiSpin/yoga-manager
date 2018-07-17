package com.api.guispin.yogamanager.enums;

public enum TipoTelefone {

    FIXO("Fixo"),
    CELULAR("Celular"),
    TRABALHO("Trabalho"),
    RECADO("Recado");

    private final String tipoTelefone;

    TipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
}
