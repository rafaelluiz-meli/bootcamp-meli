package com.company.transacoes;

public class Pagamento implements Transacao{

    public void efetuarPagamento (boolean temSaldo){
        if(temSaldo) {
            transacaoOK();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOK() {
        System.out.println("Pagamento efetuado !");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Não foi possível efetuar o pagamento !");
    }
}
