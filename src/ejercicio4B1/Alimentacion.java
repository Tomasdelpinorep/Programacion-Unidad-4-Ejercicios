package ejercicio4B1;

public class Alimentacion extends Producto{

	private int diaCaducidad;
	private boolean descontado;
	
	public Alimentacion(float precioUnitario, String nombre, String id, int diasParaCaducar) {
		super(precioUnitario, nombre, id);
		this.diaCaducidad = diasParaCaducar;
	}

	public int getDiasParaCaducar() {
		return diaCaducidad;
	}
	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diaCaducidad = diasParaCaducar;
	}
	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducar=" + diaCaducidad + "]";
	}
	
	public boolean comprobarCaducidad(int diaFecha) {
		if(diaCaducidad-diaFecha <= 2) { 
			descontado = true;
			return descontado;
		}else {
			descontado = false;
			return descontado;
		}
	}

	@Override
	public float calcularPrecio() {
		float descuento=0.3f;
		
		if(descontado) {
			return super.getPrecioUnitario()*(1-descuento);
		}else {
			return super.getPrecioUnitario();
		}
	}
	
	public void imprimirAviso(Alimentacion a) {
		
	}
	
}
