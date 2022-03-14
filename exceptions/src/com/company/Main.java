package com.company;

public class Main {

    public static void main(String[] args) {
        Integer a = 0;
        Integer b = 300;

        Integer result = 0;

        try {
            result = b/a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        }
        System.out.println("Programa Finalizado !");
    }
}
