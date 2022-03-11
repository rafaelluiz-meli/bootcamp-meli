package com.company.entities;

public class Inscricao {
    Integer idInscricao;
    Corredor corredor;
    Categoria categoria;

    public Inscricao(Integer idInscricao, Corredor corredor, Categoria categoria) {
        this.idInscricao = idInscricao;
        this.corredor = corredor;
        this.categoria = categoria;
    }

    public Integer getIdInscricao() {
        return idInscricao;
    }

    public void setIdInscricao(Integer idInscricao) {
        this.idInscricao = idInscricao;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
