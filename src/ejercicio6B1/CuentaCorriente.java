package ejercicio6B1;

public class CuentaCorriente extends Cuenta{
	
	private float mantenimiento;
	private int puntos;
	public CuentaCorriente(float balance, float mantenimiento, int puntos) {
		super(balance);
		this.mantenimiento = mantenimiento;
		this.puntos = puntos;
	}
	
	public float getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(float mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [mantenimiento=" + mantenimiento + ", puntos=" + puntos + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public float ingresar(int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float retirar(int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
