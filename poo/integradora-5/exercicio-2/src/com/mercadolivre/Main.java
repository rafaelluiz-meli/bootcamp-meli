package com.mercadolivre;

import com.mercadolivre.entities.Curriculo;
import com.mercadolivre.entities.Livro;
import com.mercadolivre.entities.Pessoa;
import com.mercadolivre.entities.Relatorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curriculo curriculo = new Curriculo(
                new Pessoa("Rafael Luiz", 20,"Avenida um, 10","rafael.luiz@gmail.com","(11) 98888-0000"),
                Arrays.asList("musico","cozinheiro"));
        Livro livro = new Livro(10,"Desconhecido","Como ficar rico", "Ficção");
        Relatorio relatorio = new Relatorio("Sobre o aquecimento do ar condicionado",2,"Engenheiro Rafael", "Engenheiro Felipe");

        GeraImpressao geraImpressao = new GeraImpressao();

        geraImpressao.imprimir(curriculo);
        geraImpressao.imprimir(livro);
        geraImpressao.imprimir(relatorio);
    }
}
