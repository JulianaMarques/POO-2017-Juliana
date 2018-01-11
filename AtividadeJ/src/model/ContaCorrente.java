package model;

import exceptions.SaldoInsuficienteException;

/**
 * Created by aluno on 11/01/18.
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(double valor) {
        super(valor);
    }

    @Override
    public void sacar(double valor) {
        if	(valor	<	0)	{
            throw new	IllegalArgumentException("Nao e possivel sacar um valor negativo" +
                    "");
        }
        if	(getSaldo()	< valor)	{
            throw new SaldoInsuficienteException(valor);
        }

        setSaldo(valor + 0.10);
    }

}
