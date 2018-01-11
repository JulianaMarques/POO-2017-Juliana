package model;

/**
 * Created by aluno on 11/01/18.
 */

public class Conta {
    private double saldo;

    public Conta() {}

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Nao e possivel depositar um valor negativo!");
        }

        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Nao e possivel sacar um valor negativo!");
        }

        this.saldo -= valor;
    }

    public void setSaldo(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
