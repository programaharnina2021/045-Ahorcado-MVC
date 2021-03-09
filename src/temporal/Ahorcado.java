package temporal;

import modelo.Palabra;
import utiles.Utiles;

public class Ahorcado {
	private Utiles utiles;

	public Ahorcado() {
		utiles = new Utiles();
	}

	public void play() {
	
		boolean acertado = false;
		do {
			char letra = utiles.pedirLetra();
			acertado = comprobarPalabraCompletada();
		} while (numeroFallos < 6 && !acertado);
	}

	


}
