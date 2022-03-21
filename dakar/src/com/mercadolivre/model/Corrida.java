package com.mercadolivre.model;

import com.mercadolivre.entities.Veiculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private Double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private Integer numeroDeVeiculosPermitidos;

    private List<Veiculo> veiculos = new ArrayList<>();

    public Corrida(){
    }

    public Corrida(Double distancia, BigDecimal premioEmDolares, String nome, Integer numeroDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numeroDeVeiculosPermitidos = numeroDeVeiculosPermitidos;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public BigDecimal getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(BigDecimal premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeVeiculosPermitidos() {
        return numeroDeVeiculosPermitidos;
    }

    public void setNumeroDeVeiculosPermitidos(Integer numeroDeVeiculosPermitidos) {
        this.numeroDeVeiculosPermitidos = numeroDeVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
    }
}
