package br.com.alura.livraria.service;

import br.com.alura.livraria.dominio.*;
import org.javamoney.moneta.Money;

import java.util.HashSet;
import java.util.Set;

import static java.time.LocalDate.now;

public class SelecaoDeLivro {

    private final TodosLivros todosLivros;
    private final CalculadoraFrete calculadoraFrete;
    private final Set<CarrinhoDeCompras> carrinhos;


    public SelecaoDeLivro(TodosLivros todosLivros, CalculadoraFrete calculadoraFrete) {
        this.todosLivros = todosLivros;
        this.calculadoraFrete = calculadoraFrete;
        this.carrinhos = new HashSet<>();
    }

    public CarrinhoDeCompras adicionarLivroNoCarrinhoDoCliente(ISBN isbn, Cliente cliente) {
        Livro livro = todosLivros.por(isbn);
        Money valorFrete = calculadoraFrete.baseadoEm(cliente.getCep());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente, livro, valorFrete, now());
        if(carrinhos.contains(carrinho)) {
            carrinho = carrinhos.stream()
                    .filter(umCarrinho -> umCarrinho.doCliente(cliente))
                    .findFirst().orElse(null);
            if(carrinho != null)carrinho.getLivros().adicionar(livro);
        }
        else carrinhos.add(carrinho);
        return carrinho;
    }
}
