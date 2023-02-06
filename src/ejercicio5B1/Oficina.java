package ejercicio5B1;

import java.util.Arrays;

public class Oficina {

	private Empleado [] listaEmpleados;

	public Oficina(Empleado[] listaEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
	}

	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Oficina [listaEmpleados=" + Arrays.toString(listaEmpleados) + "]";
	}
	
	public float calcularSueldo(Empleado e) {
		return e.calcularSueldo();
	}
	
	public void imprimirEmpleados() {
		for(int i=0;i<listaEmpleados.length && listaEmpleados[i]!= null; i++) {
			System.out.println((i+1)+". "+listaEmpleados[i]+".");
		}
		System.out.println("0. Salir del programa.");
	}
}
