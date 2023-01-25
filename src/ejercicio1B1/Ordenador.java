package ejercicio1B1;

public class Ordenador {
	int capacidad;
	double frecuencia,precioBase;
	String Marca;
	
	
	
	public Ordenador(int capacidad, double frecuencia, double precioBase, String marca) {
		super();
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.precioBase = precioBase;
		Marca = marca;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	@Override
	public String toString() {
		return "Ordenador [capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", precioBase=" + precioBase
				+ ", Marca=" + Marca + "]";
	}
	
	public double calcularPrecioFinal(double ganancia) {
		double div=100;
		
		return getPrecioBase()*(1+ganancia/div);
	}
	
}
