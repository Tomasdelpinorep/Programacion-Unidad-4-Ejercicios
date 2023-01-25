package ejercicio2B1;

public abstract class Documento {

	private String nombre;
	private int numEmpleados;
	private float capital;
	public Documento(String nombre, int numEmpleados, float capital) {
		super();
		this.nombre = nombre;
		this.numEmpleados = numEmpleados;
		this.capital = capital;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumEmpleados() {
		return numEmpleados;
	}
	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	public float getCapital() {
		return capital;
	}
	public void setCapital(float capital) {
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return "Documento [nombre=" + nombre + ", numEmpleados=" + numEmpleados + ", capital=" + capital + "]";
	}
	
	public abstract void imprimirDocumento();
}
