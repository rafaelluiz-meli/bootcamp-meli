package com.mercadolivre.integradora6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    private String nomeDoIngrediente;
    private Integer calorias;

}
