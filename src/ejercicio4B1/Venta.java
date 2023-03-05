package ejercicio4B1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	
	public void imprimirProductos(List<Producto> ordenadoNombre) {
		for(Producto p : ordenadoNombre) {
			System.out.println(p.getNombre());
		}
		
		System.out.println();
	}
	
	public List<Producto> ordenarPorNombre() {
		List<Producto> ordenadoNombre = new ArrayList<>(lista.values());
		Collections.sort(ordenadoNombre, new compararPorNombre());
		return ordenadoNombre;
	}
	
	public List<Producto> ordenarNatural(){
		List<Producto> ordenadoPrecio = new ArrayList<>(lista.values());
		Collections.sort(ordenadoPrecio);
		return ordenadoPrecio;
	}
	
	public void imprimirMapProductos() {
		for(Map.Entry<Integer,Producto> entry : lista.entrySet()) {
			Integer key = entry.getKey();
			Producto value = entry.getValue();
			System.out.println(key +". " + value);
		}
		System.out.println();
	}
	
	public void cambiarPrecio(Integer clave, float nuevoPrecio) {
		lista.get(clave).setPrecioUnitario(nuevoPrecio);
	}
}
