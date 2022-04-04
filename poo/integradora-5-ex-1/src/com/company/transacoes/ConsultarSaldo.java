package com.company.transacoes;

public class ConsultarSaldo implements Transacao{

    public void consultaSaldo(boolean saldo){
        if(saldo) {
            transacaoOK();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOK() {
        System.out.println("Exibindo Saldo");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Ocorreu um erro ao exibir o saldo !");
    }
}
