package model.entities.abstracts;

import model.enums.TipoNegocio;

public abstract class Negocio {
    private String nome;
    private TipoNegocio tipo;

    public Negocio(String nome){
        this.nome = nome;
    }
    public Negocio(String nome, TipoNegocio tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }

    public void setTipo(TipoNegocio tipo) {
        this.tipo = tipo;
    }
}
