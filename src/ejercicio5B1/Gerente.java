package ejercicio5B1;

public class Gerente extends Empleado{

	private float impuestos;
	
	public Gerente(String nombre, String apellidos, float sueldoBase, int numEmpleado, float impuestos) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.impuestos = impuestos;
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
