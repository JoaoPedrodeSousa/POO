package model.impl;

import model.Except;
import model.entities.Cliente;
import model.entities.Recibo;
import model.interfaces.Empresa;
import model.interfaces.IEsquemaEmprestimo;
import model.interfaces.Produto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Emprestimo implements IEsquemaEmprestimo{

    private LocalDate dataInicioEmprestimo;

    private LocalDate dataLimiteEmprestimo;

    private Integer dataDevolucao = null;

    private String statusEmprestimo = null;

    private final Integer duracaoEmpretimo;

    public Emprestimo(LocalDate dataInicioEmprestimo, Integer duracaoEmpretimo) throws Except {
        this.dataInicioEmprestimo = dataInicioEmprestimo;
        this.duracaoEmpretimo = duracaoEmpretimo;
        this.dataLimiteEmprestimo = dataInicioEmprestimo.plusDays(duracaoEmpretimo);

        if(duracaoEmpretimo<=0){
            throw new Except("Duracao do emprestimo precisa ser maior que 0 dias");
        }
    }

    public LocalDate getDataInicioEmprestimo() {
        return dataInicioEmprestimo;
    }

    public LocalDate getDataLimiteEmprestimo() {
        return dataLimiteEmprestimo;
    }

    public Integer getDataDevolucao() {
        return dataDevolucao;
    }

    public Integer getDuracaoEmpretimo() {
        return duracaoEmpretimo;
    }

    public void setDataDevolucao(Integer dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void gerarEmprestimo(Cliente destinatario, Empresa remetente, Produto produto){

    };

    public void quitarEmprestimo(Cliente destinatario, LocalDate dataDevolucao){

    };

    @Override
    public void aumentarTempoDoEmprestimo(Integer quantidadeDeTempo) {
        dataLimiteEmprestimo.plusDays(quantidadeDeTempo);
    }

    @Override
    public boolean gerarMulta(LocalDate dataDevolucao) {
        return false;
    }
}
