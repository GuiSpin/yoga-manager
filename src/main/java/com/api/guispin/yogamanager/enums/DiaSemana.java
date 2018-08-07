package com.api.guispin.yogamanager.enums;

public enum DiaSemana {

    SEGUNDA("Segunda", 1),
    TERCA("Terca", 2),
    QUARTA("Quarta", 3),
    QUINTA("Quinta", 4),
    SEXTA("Sexta", 5),
    SABADO("Sabado", 6);

    private final Integer codigoDia;
    private final String dia;

    DiaSemana(String dia, Integer codigoDia) {
        this.dia = dia;
        this.codigoDia = codigoDia;
    }
}
