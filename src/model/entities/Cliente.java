package model.entities;

import model.entities.abstracts.Pessoa;

import java.util.Objects;

public class Cliente extends Pessoa {
    private String numeroRegistro;
    Cliente(String nome){
        super(nome);
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }
    @Override
    public String toString(){
        return "Nome do Cliente: " + this.getNome() + "\n" +
                "Numero de registro: " + numeroRegistro + "\n";
    }

}
