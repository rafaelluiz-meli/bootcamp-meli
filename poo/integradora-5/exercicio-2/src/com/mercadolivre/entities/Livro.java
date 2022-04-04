package com.mercadolivre.entities;

public class Livro {

    private Integer numeroDePaginas;
    private String autor;
    private String titulo;
    private String genero;

    public Livro(Integer numeroDePaginas, String autor, String titulo, String genero) {
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroDePaginas=" + numeroDePaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
