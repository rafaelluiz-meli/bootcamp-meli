package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] cidades = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asuncion",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int temperaturas[][] = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int maior = 0;
        int menor = 0;
        int posMenor = 0;
        int posMaior = 0;
        for (int i = 0; i < temperaturas.length; i++) {
                if(temperaturas[i][1] > maior) {
                    maior = temperaturas[i][1];
                    posMaior = i;
                }
                if(temperaturas[i][0] < menor){
                    menor = temperaturas[i][0];
                    posMenor = i;
                }
        }
        System.out.println(cidades[posMaior] + " foi a cidade com temperatura mais alta chegando a " + maior + " graus.");
        System.out.println(cidades[posMenor] + " foi a cidade com temperatura mais baixa chegando a " + menor + " graus.");
    }
}
