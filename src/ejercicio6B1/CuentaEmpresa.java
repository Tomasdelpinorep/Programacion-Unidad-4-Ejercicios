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
