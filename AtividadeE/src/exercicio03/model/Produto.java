package model;

public class Produto {
	private int codigo;
	private double valor;
	private int quantidade;
	private int quantidadeMin;
	private String descricao;
	
	public Produto(int codigo, double valor, int quantidade, int quantidadeMin, String descricao) {
		this.codigo = codigo;
		this.valor = valor;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.quantidadeMin = quantidadeMin;
	}
	
	public void darBaixa() {
		if(this.quantidade > this.quantidadeMin) {
			this.quantidade--;
		}
	}
	
	public void repor() {
		this.quantidade++;
	}
	
	public void reajustar(double taxa) {
		this.valor *= (1 + (taxa / 100));
	}
	
	public String toString() {
		return "Codigo: "+this.codigo+"\n"+"Valor: "+this.valor+"\n"+"Quantidade: "+this.quantidade+"\n"+"Quantidade Mínima: "+this.quantidadeMin+"\n"+"Descricao: "+this.descricao;
	}
	
	public boolean equals(Produto p) {
		if(this.codigo == p.codigo) {
			return true;
		}
		
		return false;
	}
	
	

}
