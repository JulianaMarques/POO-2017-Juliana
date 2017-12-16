package model;

public class Gerente extends Funcionario{
	private double participacaoNosLucros;

	public Gerente(double salario) {
		super(salario);
		this.participacaoNosLucros = 10;
	}

	@Override
	public double getBonificacao(double taxa) {
		return super.getSalario() * taxa + participacaoNosLucros;
	}

}
