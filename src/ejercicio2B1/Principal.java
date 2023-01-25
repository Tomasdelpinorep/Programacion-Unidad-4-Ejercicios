package ejercicio2B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,numEmpleados;
		String nombre;
		float capital;
		
		Documento d;
		Carta c;
		TarjetaVisita tv;
		
		do {
			System.out.println("Bienvenido al programa. Vamos a crear un tipo de documento.");
			System.out.println("¿Qué desea crear? 1. Documento genérico | 2. Carta | 3. Tarjeta de visita | 0. "
					+ "Salir del programa");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Gracias por utilizar el programa");
				break;
			case 1:
				System.out.println("Usted ha elegido la opción de Documento.");
				System.out.println("¿Cuál es el nombre de la empresa?");
				nombre=Leer.dato();
				System.out.println("¿Cuántos empleados tiene la empresa?");
				numEmpleados=Leer.datoInt();
				System.out.println("¿De cuánto capital dispone la empresa?");
				capital=Leer.datoFloat();
				break;
			}
			
		}while(opcion !=0);
		

	}

}
