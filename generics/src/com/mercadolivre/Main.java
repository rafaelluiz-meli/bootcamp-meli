package com.mercadolivre;

import java.math.BigDecimal;
import java.util.ArrayList;
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

        System.out.println("Ordenando por preço");
        veiculos.sort(Comparator.comparing(Veiculo::getPreco));
        veiculos.forEach(System.out::println);
        System.out.println();
        System.out.println("Ordenando por marca");
        veiculos.sort(Comparator.comparing(Veiculo::getMarca));
        veiculos.forEach(System.out::println);
    }
}
