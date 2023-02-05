package ejercicio2B2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion,iva,irpf,tam=4,cont=0;
		String nombre;
		double salario,precio;

		Crud [] array = new Crud [tam];
		Crud objeto;
		
		do {
			System.out.println("Bienvenido al programa. ¿Desea crear un producto o un trabajador?");
			System.out.println("1. Producto | 2. Trabajador | 0. Terminar");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				break;
				
			case 1:
				System.out.println("Ha elegido crear un Producto.");
				System.out.println("¿Cómo se llama este producto?");
				nombre=Leer.dato();
				
				System.out.println("¿Cuánto cuesta este producto?");
				precio=Leer.datoDouble();
				
				System.out.println("¿Cuál es el IVA para este producto?");
				iva=Leer.datoInt();
				
				array [cont]=new Producto(nombre,precio,iva);
				cont++;
				//System.out.printf("El IVA para este producto es de %.2f€ \n", p.calculoIva(precio, iva));
				break;
				
			case 2:
				System.out.println("Ha elegido crear un Trabajador.");
				System.out.println("¿Cómo se llama este Trabajador?");
				nombre=Leer.dato();
				
				System.out.println("¿Cuál es el salario del Trabajador?");
				salario=Leer.datoDouble();
				
				System.out.println("¿Cuál es el IRPF para este Trabajador?");
				irpf=Leer.datoInt();
				
				array [cont]=new Trabajador(nombre,salario);
				cont++;
				break;
			}
		}while(opcion !=0);
		
		objeto = new Crud();
		
		System.out.println("Estos son los productos / trabajadores disponibles:");
		objeto.mostrarTodo(array);
		System.out.println();
		System.out.println("Elija una opción para calcular su IVA o Irpf:");
		opcion=Leer.datoInt()-1;
		
		objeto.calculoImpuesto(opcion, array);
	}

}
