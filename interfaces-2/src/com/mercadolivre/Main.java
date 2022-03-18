package com.mercadolivre;

import com.mercadolivre.entities.Animal;
import com.mercadolivre.entities.Cachorro;
import com.mercadolivre.entities.Gato;
import com.mercadolivre.entities.Vaca;

public class Main {

    public static void comerAnimal(Animal animal){
        animal.comer();
    }

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", "Marrom","Pastor Alemão");
        Gato gato = new Gato("Narizinho", "Cinza", "Indefinida");
        Vaca vaca = new Vaca("Rogéria", "branca", "Angus");

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
        System.out.println(vaca.emitirSom());

        comerAnimal(cachorro);
        comerAnimal(gato);
        comerAnimal(vaca);

    }
}
