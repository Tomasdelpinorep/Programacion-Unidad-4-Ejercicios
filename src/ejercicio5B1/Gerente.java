package ejercicio5B1;

public class Gerente extends Empleado{

	private float impuestos;
	
	public Gerente(String nombre, String apellidos, float sueldoBase, int numEmpleado, float impuestos) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.impuestos=impuestos;
	}

	public float getImpuestos() {
		return impuestos;
	}
	
	public void setImpuestos(float impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Gerente [impuestos=" + impuestos + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float calcularSueldo() {
		return super.getSueldoBase()*(1-(impuestos/100));
	}
}
