package ejercicio4B1;

import java.util.Map;
import java.util.Random;

public class Venta {

	private Map<Integer, Producto> lista;

	public Venta(Map<Integer, Producto> lista) {
		super();
		this.lista = lista;
	}

	public Map<Integer, Producto> getlista() {
		return lista;
	}

	public void setlista(Map<Integer, Producto> lista) {
		this.lista = lista;
	}

	public void imprimirTicket() {

		int cont = 1, cantidad;

		System.out.println("***************************************");
		System.out.println("Supermercados DonBosco SL");
		System.out.println("***************************************");
		System.out.println("PRODUCTO \t\t CANTIDAD \t\t PRECIO \t\t DESCUENTO \t\t TOTAL");

		for (Producto p : lista.values()) {
			cantidad = generarCantRandom();

			if (p instanceof Alimentacion) {
				Alimentacion aux;
				aux = (Alimentacion) p;
				if (aux.comprobarCaducidad()) {
					System.out
							.println(cont + ". " + p.getNombre() + " \t " + cantidad + " \t\t " + p.getPrecioUnitario()
									+ " \t\t " + aux.calcularDescuento() + " \t\t " + cantidad * p.getPrecioUnitario());
					cont++;
				} else {
					System.out
					.println(cont + ". " + p.getNombre() + " \t " + cantidad + " \t\t " + p.getPrecioUnitario()
							+ " \t\t " + "0" + " \t\t " + cantidad * p.getPrecioUnitario());
				}

			} else if (p instanceof Ropa) {
				Ropa aux = (Ropa) p;
				aux = (Ropa) p;
				System.out.println(cont + ". " + p.getNombre() + " \t " + cantidad + " \t\t " + p.getPrecioUnitario()
						+ " \t\t " + aux.getRebaja() + " \t\t " + cantidad * p.getPrecioUnitario());
				cont++;

			} else {
				System.out.println(cont + ". " + p.getNombre() + " \t " + cantidad + " \t\t " + p.getPrecioUnitario()
						+ " \t\t " + "N/A \t\t " + cantidad * p.getPrecioUnitario());
				cont++;
			}
		}

		System.out.println();
		System.out.println("************************************");
	}

	public static int generarCantRandom() {
		int cantidad;
		Random rnd = new Random(System.nanoTime());

		cantidad = rnd.nextInt(10) + 1;
		return cantidad;
	}
	
	public Producto findBKey(int clave) {
		return lista.get(clave);
	}
}
