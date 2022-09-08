package br.com.alura.livraria.dominio;

import static br.com.alura.livraria.dominio.Livraria.reais;
import static br.com.alura.livraria.dominio.LivroTest.OUTRO_LIVRO;
import static br.com.alura.livraria.dominio.LivroTest.UM_LIVRO;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import org.javamoney.moneta.Money;
import org.junit.Test;




public class LivrosTest {

    private Livros livros;

    @Test
    public void lerSubtotalDeColecaoVaziaDeLivros() {
        this.livros = new Livros();

        assertThat(livros.getSubtotal(), is(equalTo(Money.of(0, reais))));
    }

    @Test
    public void lerSubTotalDeColecaoComDiversosLivros() {
        this.livros = new Livros(UM_LIVRO, OUTRO_LIVRO);

        assertThat(livros.getSubtotal(), is(equalTo(Money.of(20, reais))));
    }

    @Test
    public void adicionarLivros() {
        this.livros = new Livros(UM_LIVRO);
        this.livros.adicionar(OUTRO_LIVRO);

        assertThat(livros, hasItems(UM_LIVRO, OUTRO_LIVRO));


    }
}
