package cap4;

public class Numero implements Expressao {
	
	public int numero; 
	
	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

}
