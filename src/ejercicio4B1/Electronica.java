package ejercicio4B1;

public class Electronica extends Producto{

	private float impEspecial;

	public Electronica(float precioUnitario, String nombre, String id, float impEspecial) {
		super(precioUnitario, nombre, id);
		this.impEspecial = impEspecial;
	}

	public float getImpEspecial() {
		return impEspecial;
	}

	public void setImpEspecial(float impEspecial) {
		this.impEspecial = impEspecial;
	}

	@Override
	public String toString() {
		return "Electronica [impEspecial=" + impEspecial + "]";
	}
	
	public int getDiasParaCaducar() {
		return 0;
	}
	
	public float calcularPrecio() {
		return super.getPrecioUnitario()*(1+impEspecial);
	}
}
