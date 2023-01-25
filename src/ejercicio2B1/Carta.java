package ejercicio2B1;

public class Carta extends Documento{

	private String fecha;

	public Carta(String nombre, int numEmpleados, float capital, String fecha) {
		super(nombre, numEmpleados, capital);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}
	
	public void imprimirDocumento() {
		
	}
}
