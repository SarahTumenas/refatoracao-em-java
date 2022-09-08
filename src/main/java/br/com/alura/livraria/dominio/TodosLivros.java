package br.com.alura.livraria.dominio;

public interface TodosLivros {
    Livros por(String nome);

    Livro por(ISBN isbn);
}
