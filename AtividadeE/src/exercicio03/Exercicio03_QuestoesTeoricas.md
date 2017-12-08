# Exercício 03 (Respostas)

**01.** Não haverá erro. A variável _quantReservas_ será inicializada por padrão com 0, pois pertence a uma classe.

**02.** Se a classe _Hotel_ tiver um construtor que inicialize _quantReservas_ com um valor passado como parâmetro, o resultado da execução será 2. Se a classe não possuir o construtor para inicializar _quantReservas_, haverá erro de compilação.

**03.** O resultado da execução vai ser 0, pois a variavel _a_ não está sendo inicializada no construtor não é a da classe, na verdade ela é um parâmetro _a_ passado para o construtor e está recebendo a soma dele mesmo mais _b_. Já o valor que está sendo imprimido é o valor da variavel _a_ da classe, que é inicializado por padrão com 0.

**04.** A variável _valor_ que está recebendo a soma de _valor + valor_, não é uma variável de classe, na verdade ela é um parâmetro do método. Se esse método for chamado novamente, _valor_ não acumulará as somas de _valor + valor_, pois sempre que o método for chamado uma nova soma será feita sobrescrevendo a antiga.

*Possível Solução:*

	void x(double valor) {
		this.valor = valor + valor;
	}
    
**05.** O erro é causado pela ausência de parâmetro no construtor.

*Possível solução:*

	public class TestaRadio {
		public static void main(String[] args) {
			Radio r = new Radio(10);
		}
	}
    
**06.** 
	
   a) O resultado dos dois prints é 90. _c1_ passa a apontar para _c2_, então qualquer alteração em _c1_ terá o mesmo efeito em _c2_.
    
   b) É sobrescrito pela referencia de _c2_.