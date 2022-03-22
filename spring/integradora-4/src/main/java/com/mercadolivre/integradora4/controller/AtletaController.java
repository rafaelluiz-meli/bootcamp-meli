package com.mercadolivre.integradora4.controller;

import com.mercadolivre.integradora4.dto.AtletaDTO;
import com.mercadolivre.integradora4.entities.Esporte;
import com.mercadolivre.integradora4.entities.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtletaController {

    @GetMapping(path = "/findSportsPersons")
    @ResponseBody
    public AtletaDTO mostrarAtletas(@PathVariable List<Pessoa> pessoas,
                                          @PathVariable List<Esporte> esportes){
        Pessoa pessoa = new Pessoa();
        Esporte esporte = new Esporte();

        AtletaDTO atletaDTO = new AtletaDTO();
        atletaDTO.setNome(pessoa.getNome());
        atletaDTO.setSobrenome(pessoa.getNome());
        atletaDTO.setEsporte(esporte.getNome());

        return atletaDTO;
    }
}
