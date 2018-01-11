package app;

import model.Conta;
import model.ContaCorrente;

/**
 * Created by aluno on 11/01/18.
 */
public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);

        //contaCorrente.depositar(-99);
        //contaCorrente.sacar(-78);
        //contaCorrente.sacar(2000);

        //contaCorrente.depositar(500);
        //contaCorrente.sacar(500);

        System.out.println("Saldo: R$ " + contaCorrente.getSaldo());
    }
}
