package com.company;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String ID;
    private Double peso;
    private Double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, Integer idade, String ID, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer calcularIMC(){
        double imc = peso/(Math.pow(altura,2.0));
        if(imc < 20){
            return -1;
        } else if (imc > 20 && imc < 25){
            return 0;
        } else if (imc > 25) {
            return 1;
        }
        return null;
    }

    public boolean ehMaiorIdade(){
        return idade > 18;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
