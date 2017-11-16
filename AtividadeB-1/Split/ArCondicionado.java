package Split;


public class ArCondicionado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstadoSplit split = new EstadoSplit("Desligado","--","--","--");
		split.liga_desliga();
		split.Modo("Ventilar");
		split.Temperatura("17");
		split.Velocidade("Forte");
		split.Estado();
	}

}
