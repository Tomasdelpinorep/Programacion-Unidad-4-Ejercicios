package ejercicio2B2;

public class Producto extends Crud implements IImpuesto{
	
	private String nombre;
	private double precio;
	private int iva;

	public Producto(String nombre, double precio, int iva) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}


	public void setIva(int iva) {
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", iva=" + iva + "]";
	}


	@Override
	public double calculoIva(double precio, int iva) {
		return precio*iva/100;
	}

	@Override
	public double calculoIrpf(double suelo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
