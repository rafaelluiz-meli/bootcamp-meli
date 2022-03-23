package com.mercadolivre.integradora5.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Personagem {

    private String name;
    private Integer height;
    private Double mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private String species;

}
