package br.com.alura;

public class Banco {
    public void depositar(Conta c, double valor) {
        //c.setSaldo(c.getSaldo() + valor);
        c.depositar(valor);
    }

    public void realizarTransferencia(Conta a, double valor, Conta c) {
        /*a.setSaldo(a.getSaldo() - valor);
        c.setSaldo(c.getSaldo() + valor);*/

        a.sacar(valor);
        c.depositar(valor);
    }
}
