package com.company;

import com.company.entities.Categoria;
import com.company.entities.Corredor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Categoria> listaCategorias = new ArrayList<Categoria>();
        List<Corredor> listaCorredores = new ArrayList<Corredor>();

        listaCategorias.add(new Categoria(
                "Pequeno",
                true,
                true,
                1300.00,
                1500.00
        ));

        listaCategorias.add(new Categoria(
                "Médio",
                true,
                true,
                2000.00,
                2300.00
        ));

        listaCategorias.add(new Categoria(
                "Avançado",
                false,
                true,
                0.00,
                2800.00
        ));

        listaCorredores.add(new Corredor(
                "33.777.999-00",
                "Rafael",
                "Luiz",
                20,
                "(11) 99999-0000",
                "190",
                "A+"
        ));

        listaCorredores.add(new Corredor(
                "44.777.999-00",
                "Felipe",
                "Luiz",
                16,
                "(21) 99999-1111",
                "193",
                "O-"
        ));

//        for (Corredor corredor : listaCorredores){
//            System.out.println(corredor);
//        }
//        for (Categoria categoria : listaCategorias){
//            System.out.println(categoria);
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Corrida na Selva");
        do {
            System.out.println("Digite a opção desejada");
            System.out.print("1 - Inscrição | 2 - Listar Inscrições | 3 - Cancelar Inscrição: ");
            int opcao = sc.nextInt();
            if(opcao == 1){
                System.out.print("Digite seu nome: ");
                String nome = sc.next();
                System.out.print("Digite sua idade: ");
                int idade = sc.nextInt();
                System.out.println("Digite qual Circuito quer se inscrever");
                System.out.print("1 - Pequeno | 2 - Médio | 3 - Avançado: ");
                int circuito = sc.nextInt();
            } else if (opcao == 2){
                System.out.println("Corredores cadastrados:");
            } else if (opcao == 3){
                System.out.print("Digite o número da inscrição que deseja cancelar: ");
                int cancelarID = sc.nextInt();
            } else {
                System.out.println("Opção inválida !");
            }

        } while(true);

    }
}
