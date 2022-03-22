package com.mercadolivre.integradora4.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;
}
