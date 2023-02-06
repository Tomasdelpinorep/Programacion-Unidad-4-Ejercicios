package ejercicio5B1;

public class Vendedor extends Empleado{
	
	private float cantVentas,incentivo;
	
	public Vendedor(String nombre, String apellidos, float sueldoBase, int numEmpleado, float cantVentas,
			float incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public float getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(float cantVentas) {
		this.cantVentas = cantVentas;
	}

	public float getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(float incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
