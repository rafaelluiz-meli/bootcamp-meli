package com.mercadolivre.integradora5.service;

import com.mercadolivre.integradora5.entity.Personagem;

import java.util.List;

public interface PersonagemService {
    public List<Personagem> findByName(String nome);
    public List<Personagem> findAll();
}
