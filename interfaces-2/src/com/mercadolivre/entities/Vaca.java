package com.mercadolivre.entities;

import com.mercadolivre.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {

    public Vaca(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public String emitirSom() {
        String som = "mu";
        return som;
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto...");
    }
}
