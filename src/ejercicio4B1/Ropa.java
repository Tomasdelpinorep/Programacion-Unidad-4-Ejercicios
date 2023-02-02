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
}
