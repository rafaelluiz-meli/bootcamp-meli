package com.mercadolivre.model;

import com.mercadolivre.entities.Veiculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void addCarro(Double velocidade, Double aceleracao, Integer anguloGiro, String placa){
        if(veiculos.size() < getNumeroDeVeiculosPermitidos()){
            veiculos.add(new Veiculo(velocidade,aceleracao,anguloGiro,placa, 1000.0,4));
        } else {
            System.out.println("Limite máximo de veículos atingido.");
        }
    }

    public void addMoto(Double velocidade, Double aceleracao, Integer anguloGiro, String placa){
        if(veiculos.size() < getNumeroDeVeiculosPermitidos()){
            veiculos.add(new Veiculo(velocidade,aceleracao,anguloGiro,placa, 300.0,2));
        } else {
            System.out.println("Limite máximo de veículos atingido.");
        }
    }

    public void deleteVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa){
        Object x = veiculos.stream().filter(a -> a.getPlaca().equals(placa)).findFirst();
        veiculos.remove(x);
    }

    public void definirVencedor(List<Veiculo> veiculos){
        Map<String, Double> resultado = new HashMap<>();
        for (Veiculo vencedor : veiculos){
            Double result = ((vencedor.getVelocidade() * (vencedor.getAceleracao()*0.5)) /
                    (vencedor.getAnguloGiro() * (vencedor.getPeso() - (vencedor.getRodas() * 100))));
            resultado.put(vencedor.getPlaca(),result);
        }

    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", numeroDeVeiculosPermitidos=" + numeroDeVeiculosPermitidos +
                ", veiculos=" + veiculos +
                '}';
    }
}
