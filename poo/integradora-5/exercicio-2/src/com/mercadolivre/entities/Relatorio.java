package com.mercadolivre.entities;

public class Relatorio {

    private String text;
    private Integer numeroDePaginas;
    private String autor;
    private String revisor;

    public Relatorio(String text, Integer numeroDePaginas, String autor, String revisor) {
        this.text = text;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "text='" + text + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
