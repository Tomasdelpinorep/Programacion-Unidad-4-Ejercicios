package ejercicio6B1;

public abstract class Cuenta {

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
	
	public abstract float ingresar(int cantidad);
	
	public abstract float retirar(int cantidad);
}
