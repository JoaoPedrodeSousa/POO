package model.entities;

import model.entities.abstracts.Pessoa;

import java.util.Objects;

public class Cliente extends Pessoa {
    private String numeroRegistro;
    public Cliente(String nome){
        super(nome);
    }

    public Cliente(String nome,String numeroRegistro){
        super(nome);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString(){
        return "Nome do Cliente: " + this.getNome() + "\n" +
                "Numero de registro: " + numeroRegistro + "\n";
    }

}
