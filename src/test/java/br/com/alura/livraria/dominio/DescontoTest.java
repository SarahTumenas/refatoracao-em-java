package br.com.alura.livraria.dominio;

import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;

import static br.com.alura.livraria.dominio.Livraria.reais;
import static br.com.alura.livraria.dominio.TipoDeDesconto.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class DescontoTest {

    private final Money CEM_REAIS = Money.of(100, reais);

    @Test
    void calcularDescontoOriundoDeCupom() {
        Desconto desconto = new Desconto(CEM_REAIS, CUPOM_DE_DESCONTO);

        assertEquals(desconto.getValor(), Money.of(5, reais));
    }

    @Test
    void calcularDescontoOriundoDeFidelidade() {
        Desconto desconto = new Desconto(CEM_REAIS, FIDELIDADE);

        assertEquals(desconto.getValor(), Money.of(10, reais));
    }

    @Test
    void calcularNenhumDesconto() {
        Desconto desconto = new Desconto(CEM_REAIS, NENHUM);

        assertEquals(desconto.getValor(), Money.of(0, reais));
    }
}
