package ejercicio1B2;

public class Revista extends Publicacion{
	
	private String asunto;

	public Revista(String nombre, int publishYear, boolean prestado, String asunto) {
		super(nombre, publishYear, prestado);
		this.asunto = asunto;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Override
	public String toString() {
		return "Revista [asunto=" + asunto + "]";
	}
}
