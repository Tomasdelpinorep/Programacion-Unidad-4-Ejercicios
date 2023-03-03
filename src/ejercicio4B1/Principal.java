package ejercicio4B1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion,clave;

		Producto p1 = new Alimentacion(2.20f, "Pringles Original", "01A", 120);
		Producto p2 = new Electronica(200.00f, "Xiaomi Redmi 9S", "01E", 0.15f);
		Producto p3 = new Ropa(29.99f, "Vaqueros Alvaro Moreno", "01R", 0.25f);
		Producto p4 = new Alimentacion(5.79f, "1kg Pollo Precortado", "02A", 2);

		Map<Integer,Producto> lista = new HashMap<Integer,Producto>();
		lista.put(0,p1);
		lista.put(1,p2);
		lista.put(2,p3);
		lista.put(3,p4);
		Venta v = new Venta(lista);

		System.out.println("¡Bienvenido al programa! Vamos a precargar un ticket para el programa.");
		System.out.println("¿Qué desea hacer?");

		do {
			System.out.println("1. Imprimir ticket.");
			System.out.println("2. Buscar por clave.");
			System.out.println("3. Ordenar por nombre. (NO natural)");
			System.out.println("4. Ordenar por precio (Natural)");
			System.out.println("4. Editar precio de un producto.");
			System.out.println("5. Agregar un nuevo producto");
			System.out.println("0. Salir del programa.");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				v.imprimirTicket();
				break;

			case 2:
				System.out.println("Indique la clave del producto que desee buscar:");
				System.out.println("Las claves disponibles son: " + lista.keySet());
				clave=Leer.datoInt();
				System.out.println(v.findBKey(clave));
				System.out.println();
				break;
				
			case 3:
				List<String> ordenadoNombre = new ArrayList<>(lista.values());
				break;
			}
		} while (opcion != 0);

	}

}
