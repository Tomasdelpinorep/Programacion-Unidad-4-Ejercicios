package ejercicio1B2;

public interface IPublicacion {

	int contarPrestado(Publicacion [] arrayPublicaciones);
	
	Publicacion [] publicacionesAnteriores (Publicacion [] arrayPublicaciones,int anio);
}
