package ejercicio3B1;

public abstract class Vehiculo {
	
	private int cilindrada,potencia;
	private int emisiones;
	
	public Vehiculo(int cilindrada, int potencia, int emisiones) {
		super();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.emisiones = emisiones;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getEmisiones() {
		return emisiones;
	}
	public void setEmisiones(int emisiones) {
		this.emisiones = emisiones;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [cilindrada=" + cilindrada + ", potencia=" + potencia + ", emisiones=" + emisiones + "]";
	}
	
	public abstract float calcularImpuesto(float [] fijo);
}
