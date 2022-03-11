package com.company;

import com.company.entities.Categoria;
import com.company.entities.Corredor;
import com.company.entities.Inscricao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Categoria> listaCategorias = new ArrayList<Categoria>();
        List<Corredor> listaCorredores = new ArrayList<Corredor>();
        List<Inscricao> listaInscricoes = new ArrayList<Inscricao>();

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

        Scanner sc = new Scanner(System.in);

        System.out.println("Corrida na Selva");
        do {
            System.out.println("Digite a opção desejada");
            System.out.print("1 - Inscrição | 2 - Listar Inscrições por Categoria | 3 - Cancelar Inscrição: ");
            int opcao = sc.nextInt();
            if(opcao == 1){
                System.out.print("Digite seu RG: ");
                String rg = sc.next();
                System.out.print("Digite seu primeiro nome: ");
                String nome = sc.next();
                System.out.print("Digite seu último nome: ");
                String sobrenome = sc.next();
                System.out.print("Digite sua idade: ");
                int idade = sc.nextInt();
                System.out.print("Digite o número do seu celular: ");
                String celular = sc.next();
                System.out.print("Digite um telefone de emergência: ");
                String emergencia = "(11) 92222-0000";
                System.out.print("Digite seu tipo sanguíneo: ");
                String tipoDoSangue = "O+";
                System.out.println("Digite qual Circuito quer se inscrever");
                System.out.print("1 - Pequeno | 2 - Médio | 3 - Avançado: ");
                int circuito = sc.nextInt();
                Corredor corredor = new Corredor(rg,nome,sobrenome,idade,celular,emergencia,tipoDoSangue,circuito);
                listaCorredores.add(corredor);
                listaInscricoes.add(new Inscricao(1,corredor,circuito));
            } else if (opcao == 2){
                System.out.print("1 - Pequeno | 2 - Médio | 3 - Avançado: ");
                int opcaoCategoria = sc.nextInt();
                switch (opcaoCategoria){
                    case 1:
                        for (Inscricao inscricao : listaInscricoes){
                            if(inscricao.getIdCategoria() == 1){
                                System.out.println(inscricao);
                            }
                        };
                        break;
                    case 2:
                        for (Inscricao inscricao : listaInscricoes){
                            if(inscricao.getIdCategoria() == 2){
                                System.out.println(inscricao);
                            }
                        };
                        break;
                    case 3:
                        for (Inscricao inscricao : listaInscricoes){
                            if(inscricao.getIdCategoria() == 3){
                                System.out.println(inscricao);
                            }
                        };
                        break;
                }
            } else if (opcao == 3){
                System.out.print("Digite o número da inscrição que deseja cancelar: ");
                int cancelarID = sc.nextInt();
            } else {
                System.out.println("Opção inválida !");
            }

        } while(true);

    }
}
