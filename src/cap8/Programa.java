package cap8;

public class Programa {
	
	public static void main(String[] args) {
		EmpresaFacade fachada = new EmpresaFacadeSingleton().getInstancia();
		fachada.buscaCliente("222");
		Fatura fatura = fachada.criaFatura(new Cliente(), 100.0);
		fachada.geraCobranca(fatura);
	}

}
