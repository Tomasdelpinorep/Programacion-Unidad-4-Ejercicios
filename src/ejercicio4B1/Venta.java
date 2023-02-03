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
	
	public void imprimirTicket(LineaDeVenta [] lineaTicket) {
		Alimentacion aux; //Objeto auxiliar
		
		System.out.println("***************************************");
		System.out.println("Supermercados DonBosco SSL");
		System.out.println("***************************************");
		System.out.println("PRODUCTO \t\t CANTIDAD \t\t PRECIO \t\t DESCUENTO \t\t TOTAL");
		for(int i=0;i<lineaTicket.length;i++) {
			
			if(lineaTicket[i].getP() instanceof Alimentacion) {
				aux = (Alimentacion)lineaTicket[i].getP(); //ESTO ES IMPORTANTE, HE CONVERTIDO UN TIPO PRODUCTO EN UNO TIPO ALIMENTACION POR SI QUIERO LLAMAR A LOS MÉTODOS EXLCUSIVOS DE ALIMENTACION
				
				System.out.println(aux.getNombre()+" \t\t "+lineaTicket[i].getCantidad()+ "\t\t "
						+aux.calcularPrecio()+" \t\t "+ aux.calcularDescuento() + " \t\t " + lineaTicket[i].calcularPrecioProductoTotal(aux));
				
				aux.imprimirAviso(); //Era necesario el aux para llamar este método exclusivo a Alimentacion
				
			}else if(lineaTicket[i].getP() instanceof Ropa) {
				System.out.println(lineaTicket[i].getP().getNombre()+" \t\t "+lineaTicket[i].getCantidad()+ "\t\t "
						+lineaTicket[i].getP().calcularPrecio() +" \t\t "+lineaTicket[i].getP().calcularDescuento()+ " \t\t " + lineaTicket[i].calcularPrecioProductoTotal(lineaTicket[i].getP()));
				
			}else if(lineaTicket[i].getP() instanceof Electronica) {
				System.out.println(lineaTicket[i].getP().getNombre()+" \t\t "+lineaTicket[i].getCantidad()+ "\t\t "
						+lineaTicket[i].getP().calcularPrecio() +" \t\t "+lineaTicket[i].getP().calcularDescuento()+ " \t\t "+lineaTicket[i].calcularPrecioProductoTotal(lineaTicket[i].getP()));
			}
		}
	}
}
