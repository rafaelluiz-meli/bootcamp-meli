package com.mercadolivre.integradora6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prato {

    private String nomeDoPrato;
    private Integer peso;

}