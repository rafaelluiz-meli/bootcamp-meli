package com.company;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Pereciveis("Carne",20.0,3));
        produtos.add(new Pereciveis("Maça",2.0,2));
        produtos.add(new Pereciveis("Alface",1.0,1));
        produtos.add(new NaoPereciveis("Arroz",10.0,"1"));
        produtos.add(new NaoPereciveis("Feijão",10.0,"2"));
        produtos.add(new NaoPereciveis("Macarrão",10.0,"1"));

    }

}
