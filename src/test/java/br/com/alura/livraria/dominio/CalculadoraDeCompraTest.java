package br.com.alura.livraria.dominio;

import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;

import static br.com.alura.livraria.dominio.Livraria.reais;
import static br.com.alura.livraria.dominio.TipoDeDesconto.CUPOM_DE_DESCONTO;
import static br.com.alura.livraria.dominio.TipoDeDesconto.NENHUM;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class CalculadoraDeCompraTest {

    private final Money subtotal = Money.of(100, reais);
    private final Money frete = Money.of(1, reais);

    private final CalculadoraDeCompra calculadora = new CalculadoraDeCompra();

    @Test
     void calcularValorDaCompraComFreteESemDesconto() {
        Money valorObtido = calculadora.calcularValorTotal(subtotal, frete, new Desconto(subtotal, NENHUM));

        assertEquals (valorObtido, Money.of(101, reais));
    }

    @Test
     void calcularValorDaCompraComFreteEDesconto() {
        Money valorObtido = calculadora.calcularValorTotal(subtotal, frete, new Desconto(subtotal, CUPOM_DE_DESCONTO));

        assertEquals (valorObtido,(Money.of(96, reais)));
    }

    @Test
    void calcularValorDaCompraComSubtotalIgualAZero() {
        Money valorObtido = calculadora.calcularValorTotal(Money.of(0, reais), frete, new Desconto(subtotal, CUPOM_DE_DESCONTO));

        assertEquals (valorObtido,(Money.of(0, reais)));
    }
}
