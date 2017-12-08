package exercicio02;

public class TestaEquipamento {

	public static void main(String[] args) {
		Equipamento equipamento1 = new Equipamento();
		Equipamento equipamento2 = new Equipamento();
		
		equipamento1.ligar();
		equipamento2.desligar();
		
		equipamento1.inverter();
		equipamento2.inverter();
		
		System.out.println("Equipamento 1");
		if(equipamento1.getLigado()) {
			System.out.println("Ligado!");
		}
		
		else {
			System.out.println("Desligado!");
		}
		
		System.out.println("Equipamento 2");
		if(equipamento2.getLigado()) {
			System.out.println("Ligado!");
		}
		
		else {
			System.out.println("Desligado!");
		}

	}

}
