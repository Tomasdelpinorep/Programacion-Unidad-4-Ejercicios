package ejercicio3B1;

public class Coche extends Vehiculo{

	private int numPuertas;

	public Coche(int cilindrada, int potencia, int emisiones, int numPuertas) {
		super(cilindrada, potencia, emisiones);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + "]";
	}
	
	public float calcularImpuesto(float [] fijo) {
		float impuesto=0.25f;
		
		return fijo[super.getEmisiones()]+(super.getPotencia()*impuesto);
	}
}
