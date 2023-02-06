package ejercicio5B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;
		float impuestos,incentivo;
		Empleado e1,e2,e3,e4;
		Oficina o;
		
		e1=new Vendedor("Tomás","del Pino",1200f,01,2700f);
		e2=new Vendedor("Javier","Prieto",1200f,02,2400f);
		e3=new Gerente("Alejandro","Sanz",2700f,03);
		e4=new Gerente("Cristiano","Ronaldo",3500f,04);
		
		Empleado [] listaEmpleados = {e1,e2,e3,e4};
		o= new Oficina(listaEmpleados);
		
		System.out.println("Bienvenido al programa. Para empezar debe indicar el % de impuestos para los "
				+ "gerentes y el % de incentivo para los vendedores.");
		System.out.println("% Impuestos: ");
		impuestos=Leer.datoFloat();
		System.out.println("% Incentivos: ");
		incentivo=Leer.datoFloat();
		
		do {
			
			o.imprimirEmpleados();
			opcion=Leer.datoInt();
			
		}while(opcion !=0);
		
	}

}
