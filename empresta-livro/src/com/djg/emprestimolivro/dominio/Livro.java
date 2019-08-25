package com.djg.emprestimolivro.dominio;

public class Livro {

    private String codigoLivro;
    private String tituloLivro;
    private String autorLivro;

    public Livro(String codigoLivro, String tituloLivro, String autorLivro) {
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void imprimeLivro(){
        System.out.println("Código do livro: " + codigoLivro);
        System.out.println("Titulo: " + tituloLivro);
        System.out.println("Autor: " + autorLivro);
    }
}
