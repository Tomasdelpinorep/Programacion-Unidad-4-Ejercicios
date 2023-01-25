package ejercicio2B1;

public class TarjetaVisita extends Documento{
	private String nombreContacto;
	private int telefContacto;
	private int numVisitas;
	
	public TarjetaVisita(String nombre, int numEmpleados, float capital, String nombreContacto, int telefContacto,
			int numVisitas) {
		super(nombre, numEmpleados, capital);
		this.nombreContacto = nombreContacto;
		this.telefContacto = telefContacto;
		this.numVisitas = numVisitas;
	}
	
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public int getTelefContacto() {
		return telefContacto;
	}
	public void setTelefContacto(int telefContacto) {
		this.telefContacto = telefContacto;
	}
	public int getNumVisitas() {
		return numVisitas;
	}
	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}

	@Override
	public String toString() {
		return "TarjetaVisita [nombreContacto=" + nombreContacto + ", telefContacto=" + telefContacto + ", numVisitas="
				+ numVisitas + "]";
	}
	
	
}
