package ejercicio3B1;

public class Furgoneta extends Vehiculo{

	private int peso;

	public Furgoneta(int cilindrada, int potencia, int emisiones, int peso) {
		super(cilindrada, potencia, emisiones);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Furgoneta [peso=" + peso + "]";
	}
	
	public float calcularImpuesto(float [] fijo) {
		float impuesto=50;
		
		return fijo[super.getEmisiones()]+impuesto;
	}
}
