# Exercício 04 (Respostas)

**01.** 

a) (*F*) b) (*V*) c) (*F*) d) (*F*) e) (*V*)

f) (*V*) g) (*V*) h) (*V*) i) (*V*) j) (*V*)

**02.** 

	public class X {
    	private String atributo;
        
        public X(String atributo) {
        	this.atributo = atributo;
        }
        
        public String getAtributo() {
        	return this.atributo;
        }
    }
    
    public class TestaX {
    	public static void main(String[] args) {
        	X objetoX = new X();
            
            System.out.println(objetoX.getAtributo());
        }
    }
    
 **04.** 
 
 	public class Pilha {
		int[] elementos;
		int indice;
		int tamanho;

		Pilha(int tamanho) {
			this.tamanho = tamanho;
			elementos = new int[tamanho];
		}

		void empilhar(int i) {
        	if(indice < tamanho) {
				elementos[indice] = i;
				indice++;
			}
		}
        
   **05.** O resultado é 0. Pois atende a condição do *if* que executa a linha de código que imprime *a* x *b*, que são respectivamente 12 e 0.
   
  **07.** 
  
 a) 90; 90; 90. *c1*, *c2* e *c3* estão apontando para o mesmo objeto.
 
 **08.** Sim, pois a posição 0 do vetor _contas_ está vazia.
 
 	...
 	Conta[] contas = new Conta[5];
     contas[0] = new Conta("1",100);
     contas[0].sacar(10);
     System.out.println(contas[0].saldo);
     ...
     
**09.** Não, pois saldo é uma variável de classe, então é inicializado por padrão, nesse caso com 0.