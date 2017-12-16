package model;

public class Diretor extends Funcionario {

	public Diretor(double salario) {
		super(salario);
	}

	@Override
	public double getBonificacao(double taxa) {
		double bonificacao = this.getSalario();
		
		return bonificacao += bonificacao * taxa;
	}
}
