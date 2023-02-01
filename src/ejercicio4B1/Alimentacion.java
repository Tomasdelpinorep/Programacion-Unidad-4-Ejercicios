package ejercicio4B1;

public class Alimentacion extends Producto{

	private int diasParaCaducar;
	
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
		return "Alimentacion [diasParaCaducar=" + diasParaCaducar + "]";
	}
	
	public void comprobarCaducidad(Producto p) {
		if(p.getDiasParaCaducar() <= 2) { //no sé pillar los días de caducidad ya que sólo los de tipo alimentación tienen eso
			System.out.println("AVISO: Este producto va a caducar próximamente.");
		}
	}
}
