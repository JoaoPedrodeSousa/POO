package model.interfaces;

import model.entities.Cliente;

import java.time.LocalDate;

public interface IEsquemaEmprestimo {

    void gerarEmprestimo(Cliente destinatario, Empresa remetente, Produto produto);

    void quitarEmprestimo(Cliente destinatario, LocalDate dataDevolucao);

    void aumentarTempoDoEmprestimo(Integer tempoDecorrido);

    boolean gerarMulta(LocalDate dataDevolucao);

}
