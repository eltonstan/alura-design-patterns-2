package cap5;

public class Visitor {
	
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		System.out.print("+");
		soma.getDireita().aceita(this);
		System.out.print(")");
	}
	
	public void visitaSubstracao(Substracao substracao) {
		System.out.print("(");
		substracao.getEsquerda().aceita(this);
		System.out.print("-");
		substracao.getDireita().aceita(this);
		System.out.print(")");
	}
	
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

}
