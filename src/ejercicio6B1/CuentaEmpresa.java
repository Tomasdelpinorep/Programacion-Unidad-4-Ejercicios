package ejercicio6B1;

public class CuentaEmpresa extends Cuenta{
	
	public CuentaEmpresa(float balance) {
		super(balance);
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [toString()=" + super.toString() + "]";
	}

	@Override
	public void ingresar(float cantidad) {
		super.ingresar(cantidad);
	}

	@Override
	public void retirar(float cantidad) {
		float cuota = 1f;
		
		super.retirar(cantidad + cuota);
	}
	
}
