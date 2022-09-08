package br.com.alura.banco;


import br.com.alura.banco.Conta;
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
