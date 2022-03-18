package com.mercadolivre.entities;

import com.mercadolivre.interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    public Gato(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public String emitirSom() {
        String som = "miau";
        return som;
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne...");
    }
}
