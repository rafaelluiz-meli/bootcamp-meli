package com.company.transacoes;

public class Deposito implements Transacao {

    public void depositar(boolean valorExiste){
        if(valorExiste) {
            transacaoOK();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOK() {
        System.out.println("Depósito realizado !");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Depósito não realizado !");
    }
}
