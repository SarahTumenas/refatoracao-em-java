package br.com.alura.banco;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor;

    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public static class Banco {
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
}
