package control;

import modelo.GestionDatos;

public class AhorcadoController {
	private GestionDatos gestionDatos;

	public AhorcadoController() {
		super();
		this.gestionDatos=new GestionDatos();
	}

	public void guardarSecreta(String text) {
		this.gestionDatos.crearSecreta(text);
	}
	
	public void buscaLetra(char letra) {
		this.gestionDatos.comprobarLetraEnPalabra(letra);
	}

	public String getParcial() {
		return this.gestionDatos.getParcial();
	}

	public String getFallos() {
		return this.gestionDatos.getFallos();
	}
}
