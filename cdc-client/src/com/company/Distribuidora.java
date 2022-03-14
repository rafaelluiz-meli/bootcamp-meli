package com.company;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Pereciveis("Carne",20.0,3));
        produtos.add(new Pereciveis("Maça",2.0,2));
        produtos.add(new Pereciveis("Alface",1.0,1));
        produtos.add(new NaoPereciveis("Arroz",8.0,"1"));
        produtos.add(new NaoPereciveis("Feijão",5.0,"2"));
        produtos.add(new NaoPereciveis("Macarrão",3.0,"1"));

//        produtos.forEach(produto -> {
//            System.out.println(produto);
//        });

        List<Produto> vendas = new ArrayList<Produto>();

        String produtoPerecivelComprado1 = "Carne";
        String produtoNaoPerecivelComprado1 = "Arroz";

        for(Produto venda : produtos){
            if(venda.getNome() == produtoPerecivelComprado1){
                double total = venda.calcular(5);
                System.out.println(venda);
                System.out.println("Preço: R$ " + total);
            }
            if(venda.getNome() == produtoNaoPerecivelComprado1){
                double total = venda.calcular(5);
                System.out.println(venda);
                System.out.println("Preço: R$ " + total);
            }
        }
    }

}
