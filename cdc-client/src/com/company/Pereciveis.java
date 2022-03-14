package com.company;

public class Pereciveis extends Produto{
    private Integer diasParaVencer;

    public Pereciveis(String nome, Double preco, Integer diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public Integer getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(Integer diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public Double calcular(int quantidadeDeProdutos) {
        if(diasParaVencer == 1) {
            return super.calcular(quantidadeDeProdutos) / 4;
        } else if(diasParaVencer == 2) {
            return super.calcular(quantidadeDeProdutos) / 3;
        } else if (diasParaVencer == 3) {
            return super.calcular(quantidadeDeProdutos) / 2;
        }
        return null;
    }
}
