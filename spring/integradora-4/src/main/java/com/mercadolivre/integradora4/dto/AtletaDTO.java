package com.mercadolivre.integradora4.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter

public class AtletaDTO implements Serializable {

    private String nome;
    private String sobrenome;
    private String esporte;

}
