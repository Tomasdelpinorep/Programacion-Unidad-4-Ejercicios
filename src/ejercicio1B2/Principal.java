package ejercicio1B2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Escribe una aplicación en la que se implementen los dos métodos siguientes que deben estar en una interface:
a) cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos están prestados.
b) publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y devuelve cuántas publicaciones tienen fecha anterior al 
año recibido por parámetro.
c) En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, prestar uno de los libros, mostrar por pantalla 
los datos almacenados en el array y mostrar por pantalla cuántas hay prestadas y cuantas hay anteriores a 1990.*/
		
		int anio;
		Publicacion p1,p2,p3,p4;
		p1 = new Libro("Hobbit",1999,true,"negro");
		p2 = new Libro("Señor de los anillos",2003,false,"negro");
		p3 = new Revista("HOLA!",2021,false,"Lola Lolita fuma en un bar");
		p4 = new Revista("Marca",2022,true,"ESCÁNDALO: Vinícius se queja de insultos lanzados en su contra");
		Publicacion [] arrayPublicaciones = {p1,p2,p3,p4};
		
		//A
		System.out.println(p1.contarPrestado(arrayPublicaciones));
		
		//B
		System.out.println("Escriba un año:");
		anio=Leer.datoInt();
		
		if(p1.publicacionesAnteriores(arrayPublicaciones, anio)[0] == null) {
			System.out.println("No existen publicaciones anteriores a esta fecha.");
		}else {
			for(int i=0;p1.publicacionesAnteriores(arrayPublicaciones,anio)[i] != null && i<p1.publicacionesAnteriores(arrayPublicaciones,anio).length;i++) {
				System.out.println(p1.publicacionesAnteriores(arrayPublicaciones, anio)[i]);
			}
		}
		
		//C
		System.out.println();
		System.out.println("Se mostarán todas las publicaciones del programa:");
		p1.mostrarPublicaciones(arrayPublicaciones);
		System.out.println();
		System.out.println("De estas, están prestadas:");
		p1.mostrarPrestadas(arrayPublicaciones);
		
		
	}

}
