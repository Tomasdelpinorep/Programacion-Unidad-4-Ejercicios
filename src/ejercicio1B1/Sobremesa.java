package ejercicio1B1;

public class Sobremesa extends Ordenador{
	double precioMontaje;
	
	
	
	public Sobremesa(int capacidad, double frecuencia, double precioBase, String marca, double precioMontaje) {
		super(capacidad, frecuencia, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	public double calcularPrecioFinal(double ganancia) {
		return super.calcularPrecioFinal(ganancia)+precioMontaje;
	}
}
