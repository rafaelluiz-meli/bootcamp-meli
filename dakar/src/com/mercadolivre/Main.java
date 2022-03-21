package com.mercadolivre;

import com.mercadolivre.entities.Veiculo;
import com.mercadolivre.model.Corrida;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // instanciando uma nova corrida
        Corrida corrida = new Corrida(2.0,new BigDecimal(1000),"Street Run",4);

        // Adicionando competidores na corrida
        corrida.addCarro(150.0,20.0,3,"CAR-1000");
        corrida.addCarro(250.0,40.0,3,"CAR-2000");
        corrida.addMoto(300.0,2.0,2,"ZZZ-0010");
        corrida.addMoto(299.0,2.0,2,"ZZZ-0020");
        // Tentando adicionar um carro a mais do limite de competidores desta corrida
        corrida.addMoto(100.0,2.0,2,"ZZZ-0030");

        List<Veiculo> corredores = new ArrayList<>();
        corredores = corrida.getVeiculos();
        corrida.deleteVeiculo(corredores.get(3));
        System.out.println(corrida.getVeiculos());

        // Mostrando o vencedor da corrida
        corrida.definirVencedor(corredores);

        //corrida.deleteVeiculoComPlaca("ABC-2000");

    }
}
