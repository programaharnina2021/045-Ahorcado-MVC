package modelo;

public class GestionPalabra {
	private Palabra secreta;
	private Palabra parcial;

	public void crearSecreta(String cadena) {
		secreta=new Palabra(cadena);
		parcial=new Palabra(secreta.longitud());
	}
}
