package capitulo04;

public class Funcionario {
	private String nome;
	private String departamento;
	private String rg;
	Data dataEntrada;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	public void mostra() {
		System.out.println("Nome: "+getNome());
		System.out.println("Departamento: "+getDepartamento());
		System.out.println("Salario: "+getSalario());
		System.out.println("RG: "+getRg());
		System.out.println("Data de Entrada: "+dataEntrada.formatada());
		System.out.println("Ganho Anual: "+calculaGanhoAnual());
	}
}