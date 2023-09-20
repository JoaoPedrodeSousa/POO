package model.entities;

import java.util.Random;

public abstract class Cliente<T> {
    private String nomeCliente = null;
    private T identificador = null;

    public Cliente() {
    }

    public Cliente(String nomeCliente, T identificador) {
        this.nomeCliente = nomeCliente;
        this.identificador = identificador;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public T getIdentificador() {
        return identificador;
    }

    public void setIdentificador(T identificador) {
        this.identificador = identificador;
    }
}

