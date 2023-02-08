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
	public void ingresar(float cantidad, Oficina o) {
		float incentivo =1f;
		
		super.ingresar(cantidad + incentivo,o);
		o.setDineroPerdido(o.getDineroPerdido()+incentivo);
	}

	@Override
	public void retirar(float cantidad,Oficina o) {
		super.retirar(cantidad,o);
	}

	
	
}
