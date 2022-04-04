package com.mercadolivre.entities;

public abstract class Animal {

    private String nome;
    private String cor;
    private String especie;

    public Animal(String nome, String cor, String especie) {
        this.nome = nome;
        this.cor = cor;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public abstract String emitirSom();

    public abstract void comer();

}
