package app;

import model.AuditoriaInterna;
import model.ContaCorrente;
import model.SeguroDeVida;

public class TestaAuditoria {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Juliana", 5000);
        SeguroDeVida seguro = new SeguroDeVida();
        AuditoriaInterna auditoria = new AuditoriaInterna(5);
        
        auditoria.adicionar(cc);
        auditoria.adicionar(seguro);
        
        System.out.println(auditoria.toString());
	}

}
