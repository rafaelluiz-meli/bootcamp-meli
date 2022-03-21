package com.mercadolivre;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Ford", "Fiesta", new BigDecimal(1000)));
        veiculos.add(new Veiculo("Ford", "Focus", new BigDecimal(1200)));
        veiculos.add(new Veiculo("Ford", "Explorer", new BigDecimal(2500)));
        veiculos.add(new Veiculo("Fiat", "Uno", new BigDecimal(500)));
        veiculos.add(new Veiculo("Fiat", "Cronos", new BigDecimal(1000)));
        veiculos.add(new Veiculo("Fiat", "Torino", new BigDecimal(1250)));
        veiculos.add(new Veiculo("Chevrolet", "Aveo", new BigDecimal(1250)));
        veiculos.add(new Veiculo("Chevrolet", "Spin", new BigDecimal(2500)));
        veiculos.add(new Veiculo("Toyota", "Corolla", new BigDecimal(1200)));
        veiculos.add(new Veiculo("Toyota", "Fortuner", new BigDecimal(3000)));
        veiculos.add(new Veiculo("Renault", "Logan", new BigDecimal(950)));

	    Garagem garagem = new Garagem(1L, veiculos);

        System.out.println("--------Ordenando por preço--------");
        veiculos.sort((a,b) -> a.getPreco().compareTo(b.getPreco()));
        veiculos.forEach(System.out::println);
        System.out.println();

        System.out.println("--------Ordenando por marca--------");
        veiculos.sort((a,b) -> a.getMarca().compareTo(b.getMarca()));
        veiculos.forEach(System.out::println);
        System.out.println();

        System.out.println("--------Carros com preco menor que 1000--------");
        List<Veiculo> filtro1 = new ArrayList<>();
        for (Veiculo v : veiculos){
            if((v.getPreco().compareTo(new BigDecimal(1000)) < 0)) {
                filtro1.add(v);
            }
        }
        filtro1.forEach(System.out::println);
        System.out.println();

        System.out.println("--------Carros com preco maior ou igual a 1000--------");
        List<Veiculo> filtro2 = new ArrayList<>();
        for (Veiculo v : veiculos){
            if((v.getPreco().compareTo(new BigDecimal(1000)) >= 0)) {
                filtro2.add(v);
            }
        }
        filtro2.forEach(System.out::println);

        System.out.println("--------Preço médio dos carros--------");
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal media = BigDecimal.valueOf((double) veiculos.size());
        for(Veiculo v : veiculos){
            total = total.add(v.getPreco());
        }
        System.out.println(total.divideAndRemainder(media));
    }
}
