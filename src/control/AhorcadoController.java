package control;

import modelo.GestionDatos;

public class AhorcadoController {
	private GestionDatos gestionDatos;

	public AhorcadoController() {
		super();
		gestionDatos=new GestionDatos();
	}

	public void guardarSecreta(String text) {
		gestionDatos.crearSecreta(text);
		
	}
	
}
