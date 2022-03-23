package com.mercadolivre.integradora5.service;

import com.mercadolivre.integradora5.entity.Personagem;

import java.util.List;

public interface PersonagemService {
    public Personagem findByName(String nome);
    public List<Personagem> findAll();
}
