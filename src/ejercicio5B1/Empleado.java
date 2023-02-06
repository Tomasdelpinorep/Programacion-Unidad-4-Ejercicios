package ejercicio5B1;

public class Empleado {
 //nombre, apellidos, sueldo base y nº de Empleado.
	private String nombre,apellidos;
	private float sueldoBase;
	private int numEmpleado;
	
	
	public Empleado(String nombre, String apellidos, float sueldoBase, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.numEmpleado = numEmpleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase
				+ ", numEmpleado=" + numEmpleado + "]";
	}
	
	public float calcularSueldo() {
		return getSueldoBase();
	}
}
