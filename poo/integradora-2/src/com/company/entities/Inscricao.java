package com.company.entities;

public class Inscricao {
    private Integer idInscricao;
    private Corredor corredor;
    private Integer idCategoria;

    public Inscricao(Integer idInscricao, Corredor corredor, Integer idCategoria) {
        this.idInscricao = idInscricao;
        this.corredor = corredor;
        this.idCategoria = idCategoria;
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

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "idInscricao=" + idInscricao +
                ", corredor=" + corredor +
                '}';
    }
}
