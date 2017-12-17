package model;

public interface Conta {
	 public void depositar(double valor);
	 public boolean sacar(double valor);
	 public double getSaldo();
	 public String getTitular();
	 public void atualizar(double taxa);

}
