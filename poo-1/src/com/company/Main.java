package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Felipe",18,"0001");
        Pessoa pessoa2 = new Pessoa("Rafael", 20, "0002",70.0,1.80);
        //Pessoa pessoa3 = new Pessoa("Duda", 20);

        System.out.println(pessoa2);
        if(pessoa2.ehMaiorIdade() == true){
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de idade");
        }
        if(pessoa2.calcularIMC() == -1){
            System.out.println("Abaixo do peso");
        } else if (pessoa2.calcularIMC() == 0) {
            System.out.println("Peso saudável");
        } else if (pessoa2.calcularIMC() == 1){
            System.out.println("Sobrepeso");
        }

    }
}
