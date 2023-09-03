package model.entities;

import model.enums.StatusLivro;

public class Livro {
    private String nomeLivro;
    private String autor;
    private String genero;
    private StatusLivro status;

    public Livro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
        this.status = StatusLivro.DISPONIVEL;
    }

    public Livro(String nomeLivro, String autor) {
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.status = StatusLivro.DISPONIVEL;
    }
    public Livro(String nomeLivro, String autor, String genero) {
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        this.status = StatusLivro.DISPONIVEL;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setInformacoes(String autor, String genero){
        this.autor = autor;
        this.genero = genero;
    }

    public void inverterStatus() {
        if(this.status == StatusLivro.DISPONIVEL){
            this.status = StatusLivro.EMPRESTADO;
        }
        else if (this.status == StatusLivro.EMPRESTADO) {
            this.status = StatusLivro.DISPONIVEL;
        }
    }

    @Override
    public String toString(){
        return "INFORMACOES: " + "\n"
                + "Nome do livro: " + nomeLivro + "\n"
                + "Nome do autor: " + autor + "\n"
                + "Nome do Gênero: " + genero + "\n";
    }
}
