package ejercicio2B2;

public class Trabajador extends Crud implements IImpuesto{

	private String nombre;
	private double salario;

	
	public Trabajador(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", salario=" + salario + "]";
	}

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		double irpf=0.2;
		return sueldo*irpf;
	}

}
