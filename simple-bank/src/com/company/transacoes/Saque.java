package com.company.transacoes;

public class Saque implements Transacao{

    public void realizarSaque (boolean temSaldo){
        if(temSaldo) {
            transacaoOK();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOK() {
        System.out.println("Saque realizado !");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque não realizado !");
    }
}
