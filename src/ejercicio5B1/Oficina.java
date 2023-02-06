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
}
