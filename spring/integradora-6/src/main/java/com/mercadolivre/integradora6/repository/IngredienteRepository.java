package com.mercadolivre.integradora6.repository;

import com.mercadolivre.integradora6.entity.Ingrediente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IngredienteRepository {

    private static final String JSON_FILE = "food.json";

    public List<Ingrediente> listar(){
        List<Ingrediente> result = new ArrayList<>();
        return result;
    }
}
