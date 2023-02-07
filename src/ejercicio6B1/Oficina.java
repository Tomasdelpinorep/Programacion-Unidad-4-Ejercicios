package ejercicio6B1;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] cuentas;

	public Oficina(Cuenta[] cuentas) {
		super();
		this.cuentas = cuentas;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Oficina [cuentas=" + Arrays.toString(cuentas) + "]";
	}
	
	public float calcularTotal() {
		float total=0;
		
		for(int i=0;i<cuentas.length && cuentas[i] != null;i++) {
			total+=cuentas[i].getBalance();
		}
		return total;
	}
	
	public float getCuotaTotal() {
		return 
	}
	
	public void imprimirCuentas() {
		for(int i=0;i<cuentas.length && cuentas[i] != null ;i++) {
			System.out.println((i+1)+". "+cuentas[i]);
		}
	}
	
	public void imprimirEleccion(int opcion) {
		if(cuentas[opcion] instanceof CuentaCorriente) {
			System.out.println("Usted ha elegido una cuenta corriente.");
		}else if(cuentas[opcion] instanceof CuentaJoven) {
			System.out.println("Usted ha elegido una cuenta joven.");
		}else if(cuentas[opcion] instanceof CuentaEmpresa) {
			System.out.println("Usted ha elegido una cuenta de empresa.");
		}
	}
}
