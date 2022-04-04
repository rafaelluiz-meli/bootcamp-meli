package com.company.entities;

import com.company.transacoes.ConsultarSaldo;
import com.company.transacoes.Pagamento;
import com.company.transacoes.Saque;

public class Basico {

    ConsultarSaldo consultarSaldo;
    Pagamento pagamento;
    Saque saque;

    public Basico() {
        this.consultarSaldo = new ConsultarSaldo();
        this.pagamento = new Pagamento();
        this.saque = new Saque();
    }

    public void consultarSaldo(boolean saldo){
        this.consultarSaldo.consultaSaldo(saldo);
    }

    public void efetuarPagamento(boolean temSaldo){
        this.pagamento.efetuarPagamento(temSaldo);
    }

    public void realizarSaque(boolean temSaldo){
        this.saque.realizarSaque(temSaldo);
    }
}
