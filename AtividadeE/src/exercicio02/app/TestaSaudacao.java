package app;

import model.Saudacao;

public class TestaSaudacao {

	public static void main(String[] args) {
		Saudacao saudacao = new Saudacao("Olá, ","Juliana!");
		
		System.out.println(saudacao.obterSaudacao());
	}

}
