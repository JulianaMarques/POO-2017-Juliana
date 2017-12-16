package app;

import model.Diretor;
import model.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente(2000);
		Diretor diretor = new Diretor(4000);
		
		
		System.out.println("Salario Anterior do Gerente: "+gerente.getSalario());
		System.out.println("Salario + Bonificacao do Gerente: "+gerente.getBonificacao(100));
		
		System.out.println("Salario Anterior do Diretor: "+diretor.getSalario());
		System.out.println("Salario + Bonificacao do Diretor: "+diretor.getBonificacao(2));
	}

}
