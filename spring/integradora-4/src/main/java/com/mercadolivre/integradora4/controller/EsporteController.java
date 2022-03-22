package com.mercadolivre.integradora4.controller;

import com.mercadolivre.integradora4.entities.Esporte;
import com.mercadolivre.integradora4.service.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EsporteController {

    @Autowired
    private EsporteService esporteService;

    @GetMapping(path = "/findSports")
    @ResponseBody
    public List<Esporte> listarEsportes(){
        return esporteService.lista();
    }

    @GetMapping(path = "/findSport/{nomeDoEsporte}")
    public ResponseEntity<String> esporteResponseEntity(@PathVariable String nomeDoEsporte){
        Esporte esporte = esporteService.esporteExistente(nomeDoEsporte);
        String result = esporte.getNivel();
        return ResponseEntity.ok(result);
    }
}

