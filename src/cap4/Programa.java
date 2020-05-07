package cap4;

public class Programa {
	
	public static void main(String[] args) {
		
		Expressao esquerda = new Substracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		System.out.println(resultado);
		
	}

}
