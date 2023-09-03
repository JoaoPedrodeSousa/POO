package model.entities;

import model.EmprestimoLivro;
import model.entities.abstracts.Emprestimo;
import model.entities.abstracts.Negocio;
import model.enums.StatusLivro;
import model.enums.TipoNegocio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca extends Negocio {
    private List<Livro> listLivros = new ArrayList<>();
    private List<String[]> listCliente = new ArrayList<>();
    private List<Livro> listLivrosEmprestados = new ArrayList<>();
    private List<EmprestimoLivro> listEmprestimos = new ArrayList<>();

    public Biblioteca(String nome) {
        super(nome, TipoNegocio.SETOR_INFORMACIONAL);
    }

    public List<String[]> getListCliente() {
        return listCliente;
    }

    public List<Livro> getListLivros() {
        return listLivros;
    }
    public void adicionarLivrosNovos(Livro livro){
        listLivros.add(livro);
    }
    public void removerLivros(Livro livro){
        listLivros.remove(livro);
    }
    public void realizarEmprestimo(Cliente cliente, Livro livro, String inicioEmprestimo, int valor){
        try{
            listLivros.remove(livro);
            listLivrosEmprestados.add(livro);

            livro.inverterStatus();

            EmprestimoLivro emprestimo = new EmprestimoLivro(cliente, livro, inicioEmprestimo, valor);

            listEmprestimos.add(emprestimo);
        }
        catch (Exception e){
            if(livro.getStatus() == StatusLivro.EMPRESTADO){
                System.out.println("O livro" + livro.getNomeLivro() + "esta emprestado");
            }
        }
    }

    public void cadastrarCliente(Cliente cliente, String numeroRegistro){
        String[] cadastroCliente = new String[2];

        String nomeCliente = cliente.getNome();

        cadastroCliente[0] = nomeCliente;
        cadastroCliente[1] = numeroRegistro;

        listCliente.add(cadastroCliente);
    }

    public String getNumeroRegistro(Cliente cliente){
        String clienteNome = cliente.getNome();

        for(String[] dadosCliente : listCliente){

            if(Objects.equals(dadosCliente[0], clienteNome)){
                return dadosCliente[1];
            }
        }
        return "Nao ha cliente com o nome " + clienteNome;
    }
    public String exibirDadosClientes(Cliente cliente){
        String clienteNome = cliente.getNome();

        for(String[] dadosCliente : listCliente){

            if(Objects.equals(dadosCliente[0], clienteNome)){
                return "Nome do Cliente: " + dadosCliente[0] + "\n" +
                        "Numero de registro: " + dadosCliente[1];
            }
        }
        return "Nao ha cliente com o nome " + clienteNome;
    }
}
