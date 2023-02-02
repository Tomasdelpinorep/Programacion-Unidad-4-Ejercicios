package ejercicio4B1;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta [] ticket;

	public Venta(LineaDeVenta[] ticket) {
		super();
		this.ticket = ticket;
	}

	public LineaDeVenta[] getTicket() {
		return ticket;
	}

	public void setTicket(LineaDeVenta[] ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Venta [ticket=" + Arrays.toString(ticket) + "]";
	}
	
}
