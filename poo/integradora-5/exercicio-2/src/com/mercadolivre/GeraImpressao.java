package com.mercadolivre;

public class GeraImpressao implements ImprimirDocumento{

    @Override
    public void imprimir(Object doc) {
        System.out.println(doc.toString());
    }
}
