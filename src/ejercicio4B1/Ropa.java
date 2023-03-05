package ejercicio4B1;

public class Ropa extends Producto{
	
	private float rebaja;

	public Ropa(float precioUnitario, String nombre, String id, float rebaja) {
		super(precioUnitario, nombre, id);
		this.rebaja = rebaja;
	}

	public float getRebaja() {
		return rebaja;
	}

	public void setRebaja(float rebaja) {
		this.rebaja = rebaja;
	}

	@Override
	public String toString() {
		return "Ropa [rebaja=" + rebaja + "]";
	}
	
	public float calcularPrecio() {
		return super.getPrecioUnitario()*(1-rebaja);
	}

	@Override
	public float calcularDescuento() {
		return rebaja;
	}

	@Override
	public int compareTo(Producto p) {
		if(this.getPrecioUnitario() > p.getPrecioUnitario()) {
			return -1;
		}else if (this.getPrecioUnitario() < p.getPrecioUnitario()) {
			return 1;
		}
		return 0;
	}

}
