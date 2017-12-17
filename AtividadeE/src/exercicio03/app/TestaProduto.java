package app;

import model.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto(123343,2.50,5,2,"P1");
		Produto produto2 = new Produto(123,3.50,5,2,"P2");
		
		produto1.darBaixa();
		produto1.repor();
		produto1.equals(produto2);
		produto1.reajustar(10);
		
		produto2.darBaixa();
		produto2.repor();
		produto2.equals(produto2);
		produto2.reajustar(10);
		
		System.out.println(produto1.toString());
		System.out.println();
		System.out.println(produto2.toString());
		
		if(produto1.equals(produto2)) {
			System.out.println("Os códigos são iguais!");
		}
		
		else {
			System.out.println("Os códigos são diferentes!");
		}
	}

}
