package capitulo04;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = f1;
		Data data = new Data();
		
		f1.dataEntrada = data;
		f1.dataEntrada.dia = 20;
		f1.dataEntrada.mes = 11;
		f1.dataEntrada.ano = 2017;
		
		f1.setNome("Juliana");
		f1.setSalario(1000);
		f1.setDepartamento("TI");
		f1.setRg("2.222.222");
		f1.recebeAumento(10);
		
		f1.mostra();
		
		f2.setNome("Joao");
		f2.setSalario(1000);
		f2.setDepartamento("Financeiro");
		f2.setRg("1.111.111");
		f2.recebeAumento(10);
		
		f2.mostra();
		
		if (f1 == f2) {
			System.out.println("Iguais");
		}
		
		else {
			System.out.println("Diferentes");
		}
	}

}
