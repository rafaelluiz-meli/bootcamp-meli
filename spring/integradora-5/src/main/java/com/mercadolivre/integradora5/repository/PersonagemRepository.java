package com.mercadolivre.integradora5.repository;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadolivre.integradora5.entity.Personagem;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Repository
public class PersonagemRepository {

    private static final String JSON_FILE = "starwars.json";

    public List<Personagem> procurar(String nome) {
        List<Personagem> result = new ArrayList<>();
        try{
            List<Personagem> lista = jsonParaList(JSON_FILE);
            for (Personagem p : lista){
                if(p.getName().indexOf(nome) != -1) {
                    result.add(p);
                }
            }
            Optional<Personagem> personagem = lista.stream().filter(a -> a.getName().contentEquals(nome)).findAny();
        } catch (InputMismatchException ex){
            ex.printStackTrace();
        }
        return result;
    }

    public List<Personagem> lista() {
        return jsonParaList(JSON_FILE);
    }

    private List<Personagem> jsonParaList(String arquivoJSON){
        List<Personagem> result = new ArrayList<>();
        try{
            byte[] mapData = Files.readAllBytes(Paths.get(arquivoJSON));
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
