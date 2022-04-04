package com.company.transacoes;

public class Transferencia implements Transacao{

    public void transferir(boolean temSaldo){
        if(temSaldo) {
            transacaoOK();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOK() {
        System.out.println("Transferência efetuada !");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transferência não efetuada !");
    }
}
