package com.company;

public class Main {

    public static void main(String[] args) {
        Integer a = 0;
        Integer b = 300;

        Integer result = 0;

        try {
            result = b/a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
        }
        System.out.println("Programa Finalizado !");
    }
}
