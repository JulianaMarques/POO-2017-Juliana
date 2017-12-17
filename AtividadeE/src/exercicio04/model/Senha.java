package model;

public class Senha {
	private String valor;
	
	public Senha(String valor) {
		this.valor = valor;
 	}
	
	public boolean iguais(String valor) {
		if(this.valor == valor) {
			return true;
		}
		
		return false;
	}
	
	public boolean iguaisTrim(String valor) {
		if(this.valor.trim() == valor.trim()) {
			return true;
		}
		
		return false;
	}
	
	public boolean tamanhoSeguro(String valor) {
		if(valor.length() >= 6) {
			return true;
		}
		
		return false;
	}
	
	public boolean possuiMaiosculaMinuscula(String valor) {
		int maiuscula = 0;
		int minuscula = 0;
		
		for(int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i); 
			
			if(Character.isLowerCase(c)) {
				minuscula++;
			}
			
			if(Character.isUpperCase(c)) {
				maiuscula++;
			}
		}
		
		if(maiuscula >= 1 && minuscula >= 1) {
			return true;
		}
		
		return false;
	}
	
	public boolean possuiNumero(String valor) {
		for(int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i);
			
			if(Character.isDigit(c)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean ehValida() {
		if(tamanhoSeguro(valor) && possuiMaiosculaMinuscula(valor) && possuiNumero(valor)) {
			return true;
		}
		
		return false;
	}
	
}
