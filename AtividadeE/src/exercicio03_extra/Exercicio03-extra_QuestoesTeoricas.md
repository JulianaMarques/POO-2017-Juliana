# Exercício 03 - Extra (Respostas)

**01.** Erro de compilação, por causa da ausencia do metodo main.

**02.** A saída será 2. Pois a condição do _if_ será verdadeira e o código que está dentro do _if_ será executado.

**03.** Erro de compilação, pois na variável j é uma variável local do método main, e variáveis locais de um método não são inicializadas por padrão com um valor. Então essas variáveis devem ser inicializadas. 

**04.** Não, porque as variáveis de uma classe são inicializadas por padrão com um valor. 

**05.** Erro de compilação, por causa da ausencia de argumentos na instanciação do objeto Post.

*Proposta de Solução:*

	public class TestPost {
		public static void main(String[] args){
			Post p = new Post(0);
			p.countLikes = 1;
		}
	}
    
**06.**

*Método addLike para a classe Post*

	public void addLike() {
    	countLikes++;
    }
    
**07.** O método acumula deveria acumular quantidade, mas na verdade está incrementando quantidade em 1.

*Possível Solução:*

	public class Produto {
		int quantidade;
       	
        void acumula (int quantidade) {
			this.quanttidade += quantidade;
		}
	}
    
**08.**

	public class Carro {
		String placa;
		long chassi;
		String modelo;
		String ano;
        
        public Carro(String placa, long chassi, String modelo, String ano) {
        	this.placa = placa;
            this.chassi = chassi;
            this.modelo = modelo;
            this.ano = ano;
        }
		
        boolean clonado(Carro c) {
        	if(this.chassi == c.chassi) {
            	return true;
            }
            
            return false;
        }
    }