package model.entities.abstracts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Emprestimo {
    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate inicioEmprestimo;
    private LocalDate fimEmprestimo;

    public Emprestimo(String inicioEmprestimo, int valor){
        this.inicioEmprestimo = LocalDate.parse(inicioEmprestimo, fmt);
        this.fimEmprestimo = this.inicioEmprestimo.plusDays(valor);
    }

    public LocalDate getInicioEmprestimo() {
        return inicioEmprestimo;
    }

    public LocalDate getFimEmprestimo() {
        return fimEmprestimo;
    }
    @Override
    public String toString(){
        return "Inicio Emprestimo: " + inicioEmprestimo + "\n"
                + "Fim emprestimo: " + fimEmprestimo;
    }

    public void aumentarPrazoEmprestimo(int valor){
        LocalDate prazoAumentado = fimEmprestimo.plusDays(valor);
        fimEmprestimo = prazoAumentado;
    }

}
