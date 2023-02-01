package ejercicio4B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		float precioUnitario,rebaja,impEspecial,descuento;
		String nombre, id;
		int diasParaCaducar,cantidad,opcion;
		
		Producto p1 = new Alimentacion (2.20f,"Pringles Original","01A",120);
		Producto p2 = new Electronica (200.00f,"Xiaomi Redmi 9S","01E",0.15f);
		Producto p3 = new Ropa (29.99f,"Vaqueros Alvaro Moreno","01R",0.25f);
		Producto p4 = new Alimentacion (1.49f,"Paquete Haribo","02A",67);
		Producto p5 = new Alimentacion (5.79f,"1kg Pollo Precortado","03A",2);
		
		LineaDeVenta uno = new LineaDeVenta (p1,3);
		LineaDeVenta dos = new LineaDeVenta (p2,3);
		LineaDeVenta tres = new LineaDeVenta (p3,3);
		LineaDeVenta cuatro = new LineaDeVenta (p4,3);
		LineaDeVenta cinco = new LineaDeVenta (p5,3);
		
		LineaDeVenta [] ticket = {uno,dos,tres,cuatro,cinco};
		
		Venta v = new Venta (ticket);
		
		System.out.println("¡Bienvenido al programa! Vamos a precargar un ticket para el programa.");
		System.out.println("¿Qué desea hacer?");
		
		do {
			System.out.println("1. Imprimir ticket.");
			System.out.println("2.Listar todos los productos guardados.");
			System.out.println("0. Salir del programa.");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 1:
				v.imprimirTicket();
				break;
			}
		}while(opcion != 0);
		
	}

}
