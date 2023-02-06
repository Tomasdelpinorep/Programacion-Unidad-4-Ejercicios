package ejercicio6B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,accion;
		float cantidad;
		
		Oficina o;
		Cuenta c1,c2,c3;
		
		c1=new CuentaCorriente(1000f,30f,0);
		c2 = new CuentaJoven(150f);
		c3= new CuentaEmpresa(25000f);
		
		Cuenta [] cuentas = {c1,c2,c3};
		o= new Oficina(cuentas);
		
		System.out.println("Bienvenido al programa! ¿Qué cuenta desea elegir?");
		o.imprimirCuentas();
		opcion=Leer.datoInt();
		o.imprimirEleccion(opcion-1);
		
		System.out.println("¿Desea ingresar (1) o retirar (2) dinero?");
		accion=Leer.datoInt();
		
		switch(accion) {
		case 1:
			System.out.println("Indique la cantidad que desea ingresar:");
			cantidad=Leer.datoFloat();
			o.ingresar(opcion-1,cantidad);
			break;
			
		case 2:
			System.out.println("Indique la cantidad que desea retirar:");
			cantidad=Leer.datoFloat();
			o.retirar(cantidad);
			break;
		}

	}

}
