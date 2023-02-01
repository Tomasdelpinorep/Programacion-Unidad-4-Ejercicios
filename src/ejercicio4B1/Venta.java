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
	
	public void imprimirTicket() {
		System.out.println("NOMBRE \t\t CANTIDAD \T\T DESCUENTO \T\T TOTAL");
		for(int i = 0; i < ticket.length;i++) {
			System.out.println(ticket[i].getP().getNombre() "\t\t" + ticket[i].getCantidad() + "\t\t"
					+ ticket[i].getP().g); //no sé pillar el descuento si un producto lo tiene
		}
	}
}
