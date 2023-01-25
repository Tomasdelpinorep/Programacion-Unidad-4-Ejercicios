package ejercicio1B1;

public class Portatil extends Ordenador{

	double seguroPantalla;

	public Portatil(int capacidad, double frecuencia, double precioBase, String marca, double seguroPantalla) {
		super(capacidad, frecuencia, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
	}

	public double getSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(double seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	@Override
	public String toString() {
		return "Portatil [seguroPantalla=" + seguroPantalla + "]";
	}
	
	public double calcularPrecioFinal(double ganancia) {
		return super.calcularPrecioFinal(ganancia)+seguroPantalla;
	}
}
