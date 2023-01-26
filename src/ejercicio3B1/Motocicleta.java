package ejercicio3B1;

public class Motocicleta extends Vehiculo{

	private int numRuedas;

	public Motocicleta(int cilindrada, int potencia, int emisiones, int numRuedas) {
		super(cilindrada, potencia, emisiones);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Motocicleta [numRuedas=" + numRuedas + "]";
	}
	
	public float calcularImpuesto(float [] fijo) {
		float impuesto=0.6f;
		
		return fijo[super.getEmisiones()]+(super.getCilindrada()*impuesto);
	}
}
