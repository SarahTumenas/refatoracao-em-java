package br.com.alura;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaTest {

    @Test
    void aoSacarUmValorDeUmaContaOSaldoDeveSofrerUmaSubtracaoDesseValor(){
        Conta conta = new Conta(200d);
        conta.sacar(50d);

        assertEquals(conta.getSaldo(), 150d);

    }
}
