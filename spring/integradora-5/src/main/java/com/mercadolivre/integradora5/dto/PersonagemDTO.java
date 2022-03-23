package com.mercadolivre.integradora5.dto;

import com.mercadolivre.integradora5.entity.Personagem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PersonagemDTO implements Serializable {

    private String name;
    private Integer height;
    private Double mass;
    private String gender;
    private String homeworld;
    private String species;

    public PersonagemDTO (Personagem personagem){
        this.name = personagem.getName();
        this.height = personagem.getHeight();
        this.mass = personagem.getMass();
        this.gender = personagem.getGender();
        this.homeworld = personagem.getHomeworld();
        this.species = personagem.getSpecies();
    }
}
