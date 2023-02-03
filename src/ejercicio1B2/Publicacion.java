package ejercicio1B2;

public class Publicacion implements IPublicacion{

	private String nombre;
	private int publishYear;
	private boolean prestado;
	
	public Publicacion(String nombre, int publishYear, boolean prestado) {
		super();
		this.nombre = nombre;
		this.publishYear = publishYear;
		this.prestado = prestado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		return "Publicacion [nombre=" + nombre + ", publishYear=" + publishYear + ", prestado=" + prestado + "]";
	}

	@Override
	public int contarPrestado(Publicacion [] arrayPublicaciones) {
		int contador=0;
		
		for(int i = 0 ; i<arrayPublicaciones.length;i++) {
			if(arrayPublicaciones[i].isPrestado()) 
				contador++;
		}
		return contador;
	}

	@Override
	public Publicacion[] publicacionesAnteriores(Publicacion[] arrayPublicaciones, int anio) {
		int contador=0;
		Publicacion [] publicacionesAnteriores = new Publicacion [arrayPublicaciones.length];
		
		for(int i = 0;i<arrayPublicaciones.length;i++) {
			if(arrayPublicaciones[i] != null && arrayPublicaciones[i].getPublishYear() < anio) {
				publicacionesAnteriores[contador] = arrayPublicaciones[i];
				contador++;
			}
		}
		return publicacionesAnteriores;
	}
}
