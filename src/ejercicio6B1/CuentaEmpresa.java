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
	public void ingresar(float cantidad, Oficina o) {
		super.ingresar(cantidad,o);
	}

	@Override
	public void retirar(float cantidad, Oficina o) {
		float cuota = 1f;
		
		super.retirar(cantidad + cuota,o);
		o.setDineroGanado(o.getDineroGanado()+cuota);
	}
	
}
