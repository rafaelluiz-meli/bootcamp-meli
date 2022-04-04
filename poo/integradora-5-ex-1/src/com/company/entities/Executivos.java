package com.company.entities;

import com.company.transacoes.Deposito;
import com.company.transacoes.Transferencia;

public class Executivos {

    private Deposito deposito;
    private Transferencia transferencia;

    public Executivos() {
        this.deposito = new Deposito();
        this.transferencia = new Transferencia();
    }

    public void depositar(boolean valorExiste){
        this.deposito.depositar(valorExiste);
    }

    public void transferir(boolean temSaldo){
        this.transferencia.transferir(temSaldo);
    }
}
