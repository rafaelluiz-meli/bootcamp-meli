package com.mercadolivre.entities;

import com.mercadolivre.interfaces.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {

    public Cachorro(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public String emitirSom() {
        String som = "Auau";
        return som;
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne....");
    }
}
