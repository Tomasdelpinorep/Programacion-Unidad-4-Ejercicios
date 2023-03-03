package ejercicio4B1;

public class Alimentacion extends Producto{

	private int diasParaCaducar;
	private boolean descontado;
	
	public Alimentacion(float precioUnitario, String nombre, String id, int diasParaCaducar) {
		super(precioUnitario, nombre, id);
		this.diasParaCaducar = diasParaCaducar;
	}
	
	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}
	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}
	
	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducar=" + diasParaCaducar + ", descontado=" + descontado + ", toString()="
				+ super.toString() + "]";
	}

	public boolean comprobarCaducidad() {
		if(diasParaCaducar <= 2) { 
			descontado = true;
			return descontado;
		}else {
			descontado = false;
			return descontado;
		}
	}

	@Override
	public float calcularDescuento() {
		float descuentoCaducidad = 0.3f;
		
		if(comprobarCaducidad()) {
			return descuentoCaducidad;
		}else {
			return 0;
		}
	}
	
	@Override
	public float calcularPrecio() {
		
		if(comprobarCaducidad()) {
			return super.getPrecioUnitario()*(1-calcularDescuento());
		}else {
			return super.getPrecioUnitario();
		}
	}
	
	public void imprimirAviso() {
		if(comprobarCaducidad()) {
			System.out.println("Este producto está descontando ya que caducará proximamente.");
		}
	}
	
}
