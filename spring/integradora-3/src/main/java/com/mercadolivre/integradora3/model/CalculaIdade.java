package com.mercadolivre.integradora3.model;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.Period;

public class CalculaIdade {

    private final LocalDate dataLocal = LocalDate.now();
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public CalculaIdade(){
    }

    public String returnIdade(Integer dia, Integer mes, Integer ano) {
        LocalDate dataDeNascimento = LocalDate.of(ano,mes,dia);
        Period idadeDaPessoa = Period.between(dataDeNascimento,dataLocal);
        return String.valueOf(idadeDaPessoa.getYears());
    }
}
