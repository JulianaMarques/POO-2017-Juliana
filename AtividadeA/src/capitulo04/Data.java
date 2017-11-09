package capitulo04;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
