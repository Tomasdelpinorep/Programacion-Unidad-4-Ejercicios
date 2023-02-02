package ejercicio4B1;

public abstract class Producto { //La manera de saber si la clase debe ser abstracta o no es si el enunciado te pide que crees objetos de esta clase
	// Si lo pide, no puede ser abstracta pues no se puden instanciar objetos abstractos

	private float precioUnitario;
	private String nombre, id;
	
	public Producto(float precioUnitario, String nombre, String id) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.id = id;
	}
	
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", id=" + id + "]";
	}
	
	public abstract float calcularPrecio();
}
