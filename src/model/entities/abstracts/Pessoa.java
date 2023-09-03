package model.entities.abstracts;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String genero;

    public Pessoa(String nome){
        this.nome = nome;
    }
    Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    Pessoa(String nome, Integer idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }


}
