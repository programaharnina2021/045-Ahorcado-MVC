package modelo;

import utiles.Utiles;

public class Palabra {
	private char[] cadena;

	public Palabra(char[] cadena) {
		super();
		this.cadena = cadena;
	}

	public Palabra(String cadena) {
		super();
		this.cadena = cadena.toCharArray();
		System.out.println("ya he guardado la palabra");
	}

	public Palabra(int longitud) {
		super();
		this.cadena = new char[longitud];
		for (int i = 0; i < cadena.length; i++) {
			cadena[i]=Utiles.incognita;
		}
	}

	public String getPalabra() {
		return new String(cadena);
	}
	
	public int buscaLetra(int posicion,char letra) {
		int respuesta=-1;
		for (int i = posicion; i < cadena.length; i++) {
			if(compararPosicion(i, letra)) {
				return i;
			}
		}
		return respuesta;
	}

	public boolean compararPosicion(int posicion, char letra) {
		return cadena[posicion] == letra;
	}

	public void setLetraEnPosicion(int posicion, char letra) {
		cadena[posicion] = letra;
	}
	
	public int longitud() {
		return cadena.length;
	}
	
	public boolean comprobarPalabraCompletada() {
		if (buscaLetra(0, Utiles.incognita) != -1)
			return false;
		return true;
	}

	public char getLetra(int posicion) {
		return cadena[posicion];
	}
}
