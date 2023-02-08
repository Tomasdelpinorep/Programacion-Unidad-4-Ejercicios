package ejercicio6B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, accion;
		float cantidad;

		Oficina o;
		Cuenta c1, c2, c3;

		c1 = new CuentaCorriente(1000f, 30f, 0);
		c2 = new CuentaJoven(150f);
		c3 = new CuentaEmpresa(25000f);

		Cuenta[] cuentas = { c1, c2, c3 };
		o = new Oficina(cuentas);

		System.out.println("Bienvenido al programa! ¿Qué cuenta desea elegir?");
		o.imprimirCuentas();
		opcion = Leer.datoInt() - 1;
		o.imprimirEleccion(opcion);

		do {
			System.out.println("1. Ingresar dinero | 2. Retirar dinero | 3. Cambiar de cuenta"
					+ "| 4. Consultar el total de € en la oficina | 5. Consultar el dinero ganado "
					+ "| 6. Consultar el dinero perdido | 0. Salir del programa");
			accion = Leer.datoInt();
			
			switch (accion) {
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;

			case 1:
				System.out.println("Indique la cantidad que desea ingresar:");
				cantidad = Leer.datoFloat();
				o.ingresar(cantidad, opcion);
				break;

			case 2:
				System.out.println("Indique la cantidad que desea retirar:");
				cantidad = Leer.datoFloat();
				o.retirar(cantidad, opcion);
				break;

			case 3: // gotta figure this one out
				System.out.println("Indique la cuenta que desea elegir:");
				o.imprimirCuentas();
				opcion=Leer.datoInt()-1;
				o.imprimirEleccion(opcion);
				break;

			case 4:
				System.out.printf("Esta oficina en este momento tiene %.2f€ \n", o.calcularTotal());
				break;

			case 5:
				System.out.printf("En total se han recaudado %.2f€ \n", o.getDineroGanado());
				break;

			case 6:
				System.out.printf("Se han usado para incentivos %.2f€ \n", o.getDineroPerdido());
				break;
			}
		} while (accion != 0);

	}

}
