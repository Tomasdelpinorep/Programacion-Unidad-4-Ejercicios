package ejercicio6B1;

import utilidades.Leer;

public class Cuenta {

	private float balance;

	public Cuenta(float balance) {
		super();
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Cuenta [balance=" + balance + "]";
	}
	
	public void ingresar(float cantidad) {
		setBalance(getBalance()+cantidad);
		System.out.printf("Su nuevo balance es de %.2f€ \n",getBalance());
	}
	
	public void retirar(float cantidad) {
		if(cantidad > getBalance()) {
			System.out.println("Error. No puede retirar más dinero del disponible en la cuenta.");
			System.out.println("Por favor indique una cantidad permitida:");
			cantidad=Leer.datoFloat();
			retirar(cantidad);
		}else {
			setBalance(getBalance()-cantidad);
			System.out.printf("Su nuevo balance es de %.2f€ \n",getBalance());
		}
	}
}
