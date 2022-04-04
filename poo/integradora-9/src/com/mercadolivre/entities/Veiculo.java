package com.mercadolivre.entities;

public class Veiculo {
    private Double velocidade;
    private Double aceleracao;
    private Integer anguloGiro;
    private String placa;
    private Double peso;
    private Integer rodas;

    public Veiculo(Double velocidade, Double aceleracao, Integer anguloGiro, String placa, Double peso, Integer rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Integer getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(Integer anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloGiro=" + anguloGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
