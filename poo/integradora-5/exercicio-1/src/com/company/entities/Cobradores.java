package com.company.entities;

import com.company.transacoes.ConsultarSaldo;
import com.company.transacoes.Saque;

public class Cobradores {

    private Saque saque;
    private ConsultarSaldo consultarSaldo;

    public Cobradores() {
        this.saque = new Saque();
        this.consultarSaldo = new ConsultarSaldo();
    }

    public void realizarSaque(boolean temSaldo){
        this.saque.realizarSaque(temSaldo);
    }

    public void consultaSaldo(boolean saldo){
        this.consultarSaldo.consultaSaldo(saldo);
    }
}
