package com.company.entities;

public class Categoria {
    String categoria;
    Boolean menorIdade;
    Boolean maiorIdade;
    Double precoMenorIdade;
    Double precoMaiorIdade;

    public Categoria(String categoria, Boolean menorIdade, Boolean maiorIdade, Double precoMenorIdade, Double precoMaiorIdade) {
        this.categoria = categoria;
        this.menorIdade = menorIdade;
        this.maiorIdade = maiorIdade;
        this.precoMenorIdade = precoMenorIdade;
        this.precoMaiorIdade = precoMaiorIdade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getMenorIdade() {
        return menorIdade;
    }

    public void setMenorIdade(Boolean menorIdade) {
        this.menorIdade = menorIdade;
    }

    public Boolean getMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public Double getPrecoMenorIdade() {
        return precoMenorIdade;
    }

    public void setPrecoMenorIdade(Double precoMenorIdade) {
        this.precoMenorIdade = precoMenorIdade;
    }

    public Double getPrecoMaiorIdade() {
        return precoMaiorIdade;
    }

    public void setPrecoMaiorIdade(Double precoMaiorIdade) {
        this.precoMaiorIdade = precoMaiorIdade;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "Categoria : '" + categoria + '\'' +
                ", Permitido < de 18 = " + menorIdade +
                ", Permitido > de 18 = " + maiorIdade +
                ", Valor Menores de 18 : R$ " + precoMenorIdade +
                ", Valor Maiores de 18 : R$ " + precoMaiorIdade +
                '}';
    }
}
