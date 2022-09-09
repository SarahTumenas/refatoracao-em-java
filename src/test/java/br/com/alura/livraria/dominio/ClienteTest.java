package br.com.alura.livraria.dominio;

import org.junit.jupiter.api.Test;

import static br.com.alura.livraria.dominio.ObjetosParaTestes.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {
    @Test
    void igualdade() {
        Cliente outroCliente = new Cliente(ID_CLIENTE, CEP, ddd, numero);

        assertEquals(UM_CLIENTE, outroCliente);
        assertEquals(UM_CLIENTE.hashCode(), outroCliente.hashCode());
    }

    @Test
     void lerTelefoneFormatado() {
        assertEquals(UM_CLIENTE.getTelefone(), "(11) 55555555");
    }
}
