package exercicio02;

public class Saudacao {
	private String texto;
	private String destinatario;
	
	public Saudacao(String texto, String destinatario) {
		this.texto = texto;
		this.destinatario = destinatario;
	}
	
	public String obterSaudacao() {
		return texto + destinatario;
	}
}
