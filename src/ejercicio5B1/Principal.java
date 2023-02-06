package ejercicio5B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		float impuestos, incentivo;
		Empleado e1, e2, e3, e4, e5;
		Oficina o;

		System.out.println("Bienvenido al programa. Para empezar debe indicar el % de impuestos para los "
				+ "gerentes y el % de incentivo para los vendedores.");
		System.out.println("% Impuestos: ");
		impuestos = Leer.datoFloat();
		System.out.println("% Incentivos: ");
		incentivo = Leer.datoFloat();
		
		e1 = new Vendedor("Tomás", "del Pino", 1200f, 01, 3700f,incentivo);
		e2 = new Vendedor("Javier", "Prieto", 1200f, 02, 2400f,incentivo);
		e3 = new Gerente("Alejandro", "Sanz", 2700f, 03, impuestos);
		e4 = new Gerente("Cristiano", "Ronaldo", 3500f, 04, impuestos);
		e5 = new Empleado("Hombre","Genérico",2000f,05);
		Empleado[] listaEmpleados = { e1, e2, e3, e4 ,e5};
		o = new Oficina(listaEmpleados);

		do {

			o.imprimirEmpleados();
			o.imprimirFelicitaciones();
			opcion = Leer.datoInt();
			if(opcion == 0) {
				System.out.println("Gracias por utilizar el programa");
				
			}else {
				System.out.println("***************************************************");
				System.out.printf("El sueldo del empleado "+opcion+" es de %.2f€ \n",o.calcularSueldo(listaEmpleados[opcion-1]));
				System.out.println("***************************************************");
				System.out.printf("El total gastado en sueldos es de %.2f€ \n", o.calcularTotal());
				System.out.println("***************************************************");
				System.out.println();
			}

		} while (opcion != 0);

	}

}
