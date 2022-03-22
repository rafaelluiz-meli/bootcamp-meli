package com.mercadolivre.integradora3.controller;

import com.mercadolivre.integradora3.model.CalculaIdade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CalculaIdadeController {

    @GetMapping(path = "{dia}/{mes}/{ano}")
    public String calculaIdade(@PathVariable Integer dia,
                                  @PathVariable Integer mes,
                                  @PathVariable Integer ano) {
        CalculaIdade calculaIdade = new CalculaIdade();
        return calculaIdade.returnIdade(dia, mes, ano);
    }
}
