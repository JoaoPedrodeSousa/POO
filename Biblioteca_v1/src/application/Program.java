package application;

import model.entities.Biblioteca;
import model.entities.Cliente;
import model.entities.Livro;
import model.entities.abstracts.Pessoa;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Cliente otavio = new Cliente("Otavio","123456");
        Cliente juliana = new Cliente("Juliana","325687");
        Cliente joao = new Cliente("Joao","975412");
        Cliente maria = new Cliente("Maria","953684");

        Biblioteca alameda = new Biblioteca("Alameda");

        alameda.cadastrarCliente(otavio, otavio.getNumeroRegistro());
        alameda.cadastrarCliente(juliana, juliana.getNumeroRegistro());
        alameda.cadastrarCliente(maria, maria.getNumeroRegistro());
        alameda.cadastrarCliente(joao, joao.getNumeroRegistro());

        alameda.adicionarLivrosNovos(new Livro("O Conde de Monte Cristo","Alexandre Dumas","Classico"));
        alameda.adicionarLivrosNovos(new Livro("Apologia de Socrátes","Platao","Classico"));
        alameda.adicionarLivrosNovos(new Livro("O quize","Raquel de Queiroz","Classico"));
        alameda.adicionarLivrosNovos(new Livro("Os sofrimentos do jovem Werther","Goethe","Classico"));

        for(String[] cln : alameda.getListCliente()){
            System.out.println(alameda.exibirDadosCliente(cln));

        }

        sc.close();
    }
}
