package com.mercadolivre.integradora5.controller;

import com.mercadolivre.integradora5.dto.PersonagemDTO;
import com.mercadolivre.integradora5.entity.Personagem;
import com.mercadolivre.integradora5.service.PersonagemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonagemController {

    @Autowired
    PersonagemServiceImpl personagemService;

    @GetMapping(path = "/buscar/{nomeDoPersonagem}")
    public ResponseEntity<PersonagemDTO> findByName(@PathVariable String nomeDoPersonagem){
        //Personagem result = personagemServiceImpl.findByName(nomeDoPersonagem);
        Personagem result = new Personagem("Luke",176,80.0,"black","purple","blue","1999","Male","Brazil","Unkhnow");
        return ResponseEntity.ok(new PersonagemDTO(result));
    }

    @GetMapping(path = "/personagens")
    public ResponseEntity<List<PersonagemDTO>> findAll(){
        List<Personagem> resultDTO = personagemService.findAll();
        List<PersonagemDTO> result = new ArrayList<>();
        for(Personagem p : resultDTO){
            result.add(new PersonagemDTO(p));
        }
        return ResponseEntity.ok(result);
    }
}
