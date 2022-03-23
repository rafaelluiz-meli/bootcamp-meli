package com.mercadolivre.integradora5.service;

import com.mercadolivre.integradora5.entity.Personagem;

import com.mercadolivre.integradora5.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemServiceImpl implements PersonagemService {

    @Autowired
    PersonagemRepository repository;

    public PersonagemServiceImpl(){
    }

    @Override
    public synchronized List<Personagem> findByName(String nome) {
        return repository.procurar(nome);
    }

    @Override
    public synchronized List<Personagem> findAll() {
        return repository.lista();
    }
}
