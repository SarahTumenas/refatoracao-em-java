package br.com.alura.livraria.dominio;

import org.javamoney.moneta.Money;

public interface CalculadoraFrete {
    public Money baseadoEm(String cep);
}
