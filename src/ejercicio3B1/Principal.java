package ejercicio3B1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int cilindrada, potencia,opcion,numPuertas,numRuedas,peso,emisiones;
		
		float [] fijo={100,150,300,400};
		Motocicleta m;
		Coche c;
		Furgoneta f;

		System.out.println("Bienvenido al programa. Vamos a calcular el impuesto de circulación"
				+ " de su vehículo.");
		System.out.println("¿Qué vehículo tiene? 1. Coche | 2. Moto | 3. Furgoneta");
		opcion=Leer.datoInt();
		
		System.out.println("¿Cuál es su cilindrada?");
		cilindrada=Leer.datoInt();
		System.out.println("¿Cuál es su potencia?");
		potencia=Leer.datoInt();
		System.out.println("Y el nivel de emisiones?");
		System.out.println("1. CERO | 2. ECO | 3. Tipo B | 4. Tipo C");
		emisiones=Leer.datoInt()-1;
		
		switch(opcion) {
		case 1:
			System.out.println("¿Cuántas puertas tiene su coche?");
			numPuertas=Leer.datoInt();
			
			c=new Coche(cilindrada,potencia,emisiones,numPuertas);
			System.out.printf("El impuesto de circulación de su vehículo es de %.2f€ \n",
					c.calcularImpuesto(fijo));
			break;
			
		case 2:
			System.out.println("¿Cuántas ruedas tiene su moto?");
			numRuedas=Leer.datoInt();
			
			m=new Motocicleta (cilindrada,potencia,emisiones,numRuedas);
			System.out.printf("El impuesto de circulación de su vehículo es de %.2f€ \n",
					m.calcularImpuesto(fijo));
			break;
			
		case 3:
			System.out.println("¿Cuánto pesa su furgoneta?");
			peso=Leer.datoInt();
			
			f=new Furgoneta (cilindrada,potencia,emisiones,peso);
			System.out.printf("El impuesto de circulación de su vehículo es de %.2f€ \n",
					f.calcularImpuesto(fijo));
			break;
			
		default:
			System.out.println("Escriba una opción válida");
		}
		
		
	}

}
