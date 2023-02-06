package ejercicio5B1;

public class Gerente extends Empleado{

	private float impuestos;
	
	public Gerente(String nombre, String apellidos, float sueldoBase, int numEmpleado) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
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
		// TODO Auto-generated method stub
		return 0;
	}
}
