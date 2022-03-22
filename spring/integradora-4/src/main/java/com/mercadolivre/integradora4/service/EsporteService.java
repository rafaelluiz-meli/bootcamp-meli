package com.mercadolivre.integradora4.service;

import com.mercadolivre.integradora4.entities.Esporte;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EsporteService {

    public static List<Esporte> esportes = Collections.synchronizedList(new ArrayList<Esporte>());

    static {
        esportes.addAll(Arrays.asList(
                new Esporte("Futebol", "Profissional"),
                new Esporte("Natação", "Profissional"),
                new Esporte("Vôlei", "Profissional"),
                new Esporte("Tênis", "Profissional")
        ));
    }

    public synchronized List<Esporte> lista(){
        return esportes;
    }

    public synchronized Esporte esporteExistente(String nomeDoEsporte){
        Optional<Esporte> optional = esportes.stream().filter(a -> a.getNome().equals(nomeDoEsporte)).findFirst();
        return optional.orElse(new Esporte());
    }

}
