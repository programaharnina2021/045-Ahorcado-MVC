package older;

import modelo.Palabra;
import utiles.Utiles;

public class Ahorcado {
	private Palabra secreta;
	private Palabra parcial;
	private Utiles utiles;

	public Ahorcado() {
		utiles = new Utiles();
	}

	public void play() {
		secreta = new Palabra(utiles.pedirPalabraSecreta());
		parcial = new Palabra(secreta.longitud());
		int numeroFallos = 0;
		boolean acertado = false;
		do {
			char letra = utiles.pedirLetra();
			if (!comprobarLetraEnPalabra(letra)) {
				numeroFallos++;
			} else {
				acertado = comprobarPalabraCompletada();
			}
			System.out.println(parcial.getPalabra());
			System.out.println("quieres una pista? (s/n)");
			letra=utiles.pedirLetra();
			if(letra=='s') {
				System.out.println("hay tienes la letra"+this.buscarPrimeraLetraOculta());
			}
		} while (numeroFallos < 6 && !acertado);
	}

	private String buscarPrimeraLetraOculta() {
		int inicio = 0;
		int posicion = parcial.buscaLetra(inicio, utiles.incognita);
		if(posicion!=-1) {
			return String.valueOf(secreta.getLetra(posicion));
		}
		return "";
	}

	public boolean comprobarPalabraCompletada() {
		if (parcial.buscaLetra(0, Utiles.incognita) != -1)
			return false;
		return true;
	}

	private boolean comprobarLetraEnPalabra(char letra) {
		int posicion = 0;
		boolean respuesta = false;
		do {
			posicion = secreta.buscaLetra(posicion, letra);
			if (posicion != -1) {
				respuesta = true;
				parcial.setLetraEnPosicion(posicion, letra);
				posicion++;
			}
		} while (posicion != -1);
		return respuesta;
	}
}
