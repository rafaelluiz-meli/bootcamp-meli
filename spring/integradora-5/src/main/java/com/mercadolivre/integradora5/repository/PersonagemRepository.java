package com.mercadolivre.integradora5.repository;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadolivre.integradora5.entity.Personagem;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonagemRepository {

    public static final String STARWARS_JSON = "starwars.json";

    public void inserir(Personagem personagem) {

    }

    public Personagem procurar(String nome) {

        return null;
    }

    public List<Personagem> lista() {
        List<Personagem> result = new ArrayList<>();
        try{
            byte[] mapData = Files.readAllBytes(Paths.get(STARWARS_JSON));
            Personagem[] personagens = null;

            ObjectMapper objectMapper = new ObjectMapper();
            personagens = objectMapper.readValue(mapData, Personagem[].class);
            result = Arrays.asList(personagens);
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
