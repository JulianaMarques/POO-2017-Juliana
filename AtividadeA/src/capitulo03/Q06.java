package capitulo03;

public class Q06 {

	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;
		int proximo = 0;
		
		System.out.print("0 1 ");
		for (int i = 0; i <= 100; i++) {
			proximo = anterior + atual;
			System.out.print(proximo+" ");
			anterior = atual;
			atual = proximo;
		}

	}

}
