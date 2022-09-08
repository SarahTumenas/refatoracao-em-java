package br.com.alura.livraria.dominio;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TelefoneTest {

    @Test
    public void formatar() {
        Telefone telefone = new Telefone("11", "55555555");

        assertThat(telefone.toString(), is(equalTo("(11) 55555555")));
    }
}
