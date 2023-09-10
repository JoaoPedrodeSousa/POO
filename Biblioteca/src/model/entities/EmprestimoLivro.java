package model.entities;

import model.entities.Cliente;
import model.entities.Livro;
import model.entities.abstracts.Emprestimo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EmprestimoLivro extends Emprestimo{
    private Livro livro;
    private Cliente cliente;

    public EmprestimoLivro(Cliente cliente, Livro livro, String inicioEmprestimo, int valor) {
        super(inicioEmprestimo, valor);
        this.cliente = cliente;
        this.livro = livro;
    }

    public String getClienteNome() {
        return cliente.getNome();
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString(){
        return "INFORMACOES: " + "\n"
                + "Nome do Cliente: " + cliente.getNome() + "\n"
                + "Nome do livro: " + livro.getNomeLivro() + "\n"
                + "Periodo de Emprestimo: " + getInicioEmprestimo() + " - " + getFimEmprestimo() + "\n";
    }

}
