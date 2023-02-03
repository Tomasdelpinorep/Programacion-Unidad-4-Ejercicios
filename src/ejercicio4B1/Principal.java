package ejercicio4B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		float precioUnitario,rebaja,impEspecial;
		String nombre, id;
		int cantidad,opcion,tam=4,diasParaCaducar;;
		
		Producto p1 = new Alimentacion (2.20f,"Pringles Original","01A",120);
		Producto p2 = new Electronica (200.00f,"Xiaomi Redmi 9S","01E",0.15f);
		Producto p3 = new Ropa (29.99f,"Vaqueros Alvaro Moreno","01R",0.25f);
		Producto p4 = new Alimentacion (5.79f,"1kg Pollo Precortado","02A",2);
		
		LineaDeVenta [] lineaTicket = new LineaDeVenta [tam];
		lineaTicket[0]= new LineaDeVenta(p1,3);
		lineaTicket[1]= new LineaDeVenta(p2,1);
		lineaTicket[2]= new LineaDeVenta(p3,2);
		lineaTicket[3]= new LineaDeVenta(p4,5);
		Venta v = new Venta (lineaTicket);
		
		
		System.out.println("¡Bienvenido al programa! Vamos a precargar un ticket para el programa.");
		System.out.println("¿Qué desea hacer?");
		
		do {
			System.out.println("1. Imprimir ticket.");
			System.out.println("2.Listar todos los productos guardados.");
			System.out.println("0. Salir del programa.");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 1:
				v.imprimirTicket(lineaTicket);
				break;
				
			case 2:
				v.imprimirProductos(lineaTicket);
				break;
			}
		}while(opcion != 0);
		
	}

}
