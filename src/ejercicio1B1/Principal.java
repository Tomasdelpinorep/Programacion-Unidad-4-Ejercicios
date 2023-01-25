package ejercicio1B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int capacidad,opcion;
		double frecuencia,precioBase,ganancia=0,precioMontaje,seguroPantalla;
		String marca;
		
		Sobremesa s;
		Portatil p;
		
		System.out.println("Su ordenador será un sobremesa o un portátil?");
		System.out.println("1. SOBREMESA | 2. PORTATIL");
		opcion=Leer.datoInt();
		
		System.out.println("¿Cuál es la capacidad del disco duro?");
		capacidad=Leer.datoInt();
		System.out.println("¿Y la frecuencia?");
		frecuencia=Leer.datoDouble();
		System.out.println("¿Y el precio base?");
		precioBase=Leer.datoDouble();
		System.out.println("¿De qué marca es?");
		marca=Leer.dato();
		System.out.println("¿Cuál es el % de ganancia para el vendedor?");
		ganancia=Leer.datoDouble();
		
		switch(opcion) {
		case 1:
			System.out.println("¿Cuál es el precio del montaje?");
			precioMontaje=Leer.datoDouble();
			s=new Sobremesa(capacidad,frecuencia,precioBase,marca,precioMontaje);
			System.out.printf("El precio final es de %.2f€ \n",s.calcularPrecioFinal(ganancia));
			break;
			
		case 2:
			System.out.println("¿Cuál es el precio del seguro para la pantalla?");
			seguroPantalla=Leer.datoDouble();
			p=new Portatil(capacidad,frecuencia,precioBase,marca,seguroPantalla);
			System.out.printf("El precio final es de %.2f€ \n",p.calcularPrecioFinal(ganancia));
			break;
			
		default:
			System.out.println("Elija una opción correcta");
			break;
		}
	}

}
