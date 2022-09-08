package br.com.alura.livraria.dominio;

import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatadorUtilsTest {
    @Test
    void formatarUmValorMonetario() {
        Money dinheiro = Money.of(100, Livraria.reais);

        assertEquals(FormatadorUtils.getValorFormatado(dinheiro), "R$ 100,00");
    }
}
