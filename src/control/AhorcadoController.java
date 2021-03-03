package control;

import modelo.GestionPalabra;

public class AhorcadoController {
	private GestionPalabra gestionPalabra;

	public AhorcadoController() {
		super();
		gestionPalabra=new GestionPalabra();
	}

	public void guardarSecreta(String text) {
		gestionPalabra.crearSecreta(text);
		
	}
	
}
