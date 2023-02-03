package ejercicio1B2;

public class Libro extends Publicacion{

	private String colorPortada;

	public Libro(String nombre, int publishYear, boolean prestado, String colorPortada) {
		super(nombre, publishYear, prestado);
		this.colorPortada = colorPortada;
	}

	public String getColorPortada() {
		return colorPortada;
	}

	public void setColorPortada(String colorPortada) {
		this.colorPortada = colorPortada;
	}

	@Override
	public String toString() {
		return "Libro [colorPortada=" + colorPortada + "]";
	}

	
}
