package ejercicio3B2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Construir una clase ArrayReales que declare un atributo de tipo double[] num, lo rellene 
		 * aleatoriamente y que implemente una interfaz llamada Estadisticas. El contenido de esta 
		 * interfaz es el siguiente:
		 */
		
		int tam;
		double [] num;
		ArrayReales objeto;
		
		System.out.println("Indique el tamaño del array.");
		tam=Leer.datoInt();
		num = new double [tam];
		objeto = new ArrayReales(num);
		
		objeto.rellenarArray(tam);
		System.out.println("*******************************");
		objeto.imprimirArray();
		System.out.println("*******************************");
		
		System.out.println("El número mínimo es: " + objeto.calcularMinimo());
		System.out.println("El número máximo es: " + objeto.calcularMaximo());
		System.out.println("El sumatorio de todos los números del array es de: " + objeto.calcularSumatorio());
	}

}
