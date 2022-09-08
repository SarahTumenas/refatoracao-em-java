package br.com.alura.livraria.service;

import br.com.alura.livraria.dominio.Livros;
import br.com.alura.livraria.dominio.TodosLivros;

public class ListagemDeLivrosDisponiveis {

    private final TodosLivros todosLivros;

    public ListagemDeLivrosDisponiveis(TodosLivros todosLivros) {
        this.todosLivros = todosLivros;
    }

    public Livros listagemPor(String nome) {
        return todosLivros.por(nome);
    }
}
