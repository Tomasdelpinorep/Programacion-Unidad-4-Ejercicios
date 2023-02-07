package ejercicio6B1;

public class CuentaJoven extends Cuenta{

	public CuentaJoven(float balance) {
		super(balance);
	}

	@Override
	public String toString() {
		return "CuentaJoven [toString()=" + super.toString() + "]";
	}

	@Override
	public void ingresar(float cantidad) {
		float incentivo =1f;
		
		super.ingresar(cantidad + incentivo);
	}

	@Override
	public void retirar(float cantidad) {
		super.retirar(cantidad);
	}

	
	
}
