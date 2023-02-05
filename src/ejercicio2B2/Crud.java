package ejercicio2B2;

public class Crud {

	public void mostrarTodo(Crud [] array) {
		for(int i =0;array[i] !=null && i<array.length;i++) {
			System.out.println((i+1)+". "+array[i]);
		}
	}
	
	public void calculoImpuesto(int opcion,Crud [] array) {
		if(array[opcion] != null && array[opcion] instanceof Producto) {
			Producto aux;
			aux = (Producto)array[opcion];
			System.out.println("El IVA sobre este producto es de: "+aux.calculoIva(aux.getPrecio(), aux.getIva()));
		}else if(array[opcion] != null && array[opcion] instanceof Trabajador) {
			Trabajador aux;
			aux = (Trabajador)array[opcion];
			System.out.println("El IRPF sobre este trabajador es de: "+aux.calculoIrpf(aux.getSalario()));
		}
	}
}
