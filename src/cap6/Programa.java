package cap6;

public class Programa {
	
	public static void main(String[] args) {
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("Rua Vergueiro");
		
		Relogio relogio = new RelogioDoSistema();
		relogio.hoje();
		
	}

}
