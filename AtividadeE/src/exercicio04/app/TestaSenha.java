package app;

import model.Senha;

public class TestaSenha {

	public static void main(String[] args) {
		Senha senha = new Senha("123456ABC");
		
		System.out.println("Iguais? "+senha.iguais("123456ABC"));
		System.out.println("Iguais Trim? "+senha.iguaisTrim("12 3456ABC"));
		System.out.println("Possui Numero? "+senha.possuiNumero("123456ABC"));
		System.out.println("Possui Maiuscula e Minuscula? "+senha.possuiMaiosculaMinuscula("123456ABC"));
		System.out.println("Eh Valida? "+senha.ehValida());
	}

}
