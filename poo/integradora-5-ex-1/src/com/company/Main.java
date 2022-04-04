package com.company;

import com.company.entities.Basico;
import com.company.entities.Cobradores;
import com.company.entities.Executivos;

public class Main {

    public static void main(String[] args) {
        Basico basico = new Basico();
        Executivos executivos = new Executivos();
        Cobradores cobradores = new Cobradores();

        System.out.println("Testando cliente Básico");
        basico.consultarSaldo(true);
        basico.efetuarPagamento(false);
        basico.realizarSaque(true);

        System.out.println("Testando cliente Executivo");
        executivos.depositar(true);
        executivos.transferir(false);

        System.out.println("Testando Cobradores");
        cobradores.consultaSaldo(false);
        cobradores.realizarSaque(true);
    }
}
