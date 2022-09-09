package br.com.alura.livraria.service;

import br.com.alura.livraria.dominio.*;
import org.javamoney.moneta.Money;


public class SelecaoDeLivro {

    private final TodosLivros todosLivros;
    private final CalculadoraFrete calculadoraFrete;
    private final CarrinhoDeComprasFactory carrinhoFactory;


    public SelecaoDeLivro(TodosLivros todosLivros, CalculadoraFrete calculadoraFrete) {
        this.todosLivros = todosLivros;
        this.calculadoraFrete = calculadoraFrete;
        this.carrinhoFactory = new CarrinhoDeComprasFactory();
    }

    public CarrinhoDeCompras adicionarLivroNoCarrinhoDoCliente(ISBN isbn, Cliente cliente) {
        Livro livro = todosLivros.por(isbn);
        Money valorFrete = calculadoraFrete.baseadoEm(cliente.getCep());
        CarrinhoDeCompras carrinho = carrinhoFactory.obterCarrinho(cliente, livro, valorFrete);
        return carrinho;
    }

    }
