package com.company.entities;

public class Corredor {

    String RG;
    String nome;
    String sobrenome;
    Integer idade;
    String numeroDoCelular;
    String numeroDeEmergencia;
    String tipoSanguineo;

    public Corredor(String RG, String nome, String sobrenome, Integer idade, String numeroDoCelular, String numeroDeEmergencia, String tipoSanguineo) {
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroDoCelular = numeroDoCelular;
        this.numeroDeEmergencia = numeroDeEmergencia;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNumeroDoCelular() {
        return numeroDoCelular;
    }

    public void setNumeroDoCelular(String numeroDoCelular) {
        this.numeroDoCelular = numeroDoCelular;
    }

    public String getNumeroDeEmergencia() {
        return numeroDeEmergencia;
    }

    public void setNumeroDeEmergencia(String numeroDeEmergencia) {
        this.numeroDeEmergencia = numeroDeEmergencia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "RG :'" + RG + '\'' +
                ", Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", Idade=" + idade +
                ", Numero do Celular :'" + numeroDoCelular + '\'' +
                ", Número de Emergência :'" + numeroDeEmergencia + '\'' +
                ", Tipo Sanguíneo : '" + tipoSanguineo + '\'' +
                '}';
    }
}
