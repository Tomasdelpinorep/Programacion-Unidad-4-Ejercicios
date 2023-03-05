package ejercicio4B1;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion,clave,tipoNuevoProducto, diasCaducarNuevoProducto;
		float nuevoPrecio, precioNuevoProducto, rebajaNuevoProducto, impNuevoProducto;
		String nombreNuevoProducto, idNuevoProducto;

		Producto p1 = new Alimentacion(2.20f, "Pringles Original", "01A", 120);
		Producto p2 = new Electronica(200.00f, "Xiaomi Redmi 9S", "01E", 0.15f);
		Producto p3 = new Ropa(29.99f, "Vaqueros Alvaro Moreno", "01R", 0.25f);
		Producto p4 = new Alimentacion(5.79f, "1kg Pollo Precortado", "02A", 2);
		Producto agregado;

		Map<Integer,Producto> lista = new HashMap<Integer,Producto>();
		lista.put(0,p1);
		lista.put(1,p2);
		lista.put(2,p3);
		lista.put(3,p4);
		Venta v = new Venta(lista);
		Integer cont=lista.size()+1;

		System.out.println("¡Bienvenido al programa! Vamos a precargar un ticket para el programa.");
		System.out.println("¿Qué desea hacer?");

		do {
			System.out.println("1. Imprimir ticket.");
			System.out.println("2. Buscar por clave.");
			System.out.println("3. Ordenar por nombre alfabéticamente. (NO natural).");
			System.out.println("4. Ordenar por precio descendente (Natural).");
			System.out.println("5. Editar precio de un producto.");
			System.out.println("6. Agregar un nuevo producto.");
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
				v.imprimirProductos(v.ordenarPorNombre());
				break;
				
			case 4:
				v.imprimirProductos(v.ordenarNatural());
				break;
				
			case 5:
				System.out.println("Indique el key del producto que desea editar:");
				v.imprimirMapProductos();
				clave=Leer.datoInt();
				System.out.println("Ha elegido: \n" + lista.get(clave) + "\n");
				System.out.println("Indique el nuevo precio del producto:");
				nuevoPrecio=Leer.datoFloat();
				v.cambiarPrecio(clave, nuevoPrecio);
				System.out.printf("El nuevo precio del producto es de : %.2f€ \n\n" ,lista.get(clave).getPrecioUnitario());
				break;
				
			case 6:
				System.out.println("Indique el tipo de producto: 1. Alimentacion | 2. Electronica | 3. Ropa");
				tipoNuevoProducto=Leer.datoInt();
				System.out.println("Indique el precio del producto:");
				precioNuevoProducto=Leer.datoFloat();
				System.out.println("Indique el nombre del producto:");
				nombreNuevoProducto=Leer.dato();
				System.out.println("Indique el id del producto:");
				idNuevoProducto=Leer.dato();
				
				switch(tipoNuevoProducto) {
				case 1:
					System.out.println("Indique los días para caducar a este producto:");
					diasCaducarNuevoProducto=Leer.datoInt();
					
					agregado = new Alimentacion(precioNuevoProducto,nombreNuevoProducto,idNuevoProducto,diasCaducarNuevoProducto);
					lista.put(cont, agregado);
					cont++;
					break;
					
				case 2:
					System.out.println("Indique el impuesto especial de este producto:");
					impNuevoProducto=Leer.datoFloat();
					
					agregado = new Electronica(precioNuevoProducto,nombreNuevoProducto,idNuevoProducto,impNuevoProducto);
					lista.put(cont, agregado);
					cont++;
					break;
					
				case 3:
					System.out.println("Indique la rebaja de este producto:");
					rebajaNuevoProducto=Leer.datoFloat();
					
					agregado = new Ropa(precioNuevoProducto,nombreNuevoProducto,idNuevoProducto,rebajaNuevoProducto);
					lista.put(cont, agregado);
					cont++;
					break;
					
					default:
						System.out.println("Ha indicado un tipo de producto inexistente.");
				}
				
				break;
				
				default:
					System.out.println("Elija un opción correcta.");
			}
		} while (opcion != 0);

	}

}
