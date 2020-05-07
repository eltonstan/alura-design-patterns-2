package cap4;

public class Substracao implements Expressao {
	
	public Expressao esquerda;
	public Expressao direita;
	
	public Substracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda - valorDaDireita;
	}

}
