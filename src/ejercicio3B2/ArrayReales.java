package ejercicio3B2;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas{

	double [] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}
	
	public void rellenarArray(int tam) {
		double hasta=100;
		Random rnd= new Random(System.nanoTime());
		num = new double [tam];
		
		for(int i=0;i<num.length;i++) {
			num[i]=rnd.nextDouble(hasta);
		}
	}
	
	public void imprimirArray() {
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

	@Override
	public double calcularMinimo() {
		double min=num[0];
		
		for(int i =0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		return min;
	}

	@Override
	public double calcularMaximo() {
		double max=num[0];
		
		for(int i =0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		return max;
	}

	@Override
	public double calcularSumatorio() {
		double sumatorio=0;
		
		for(int i=0;i<num.length;i++) {
			sumatorio+=num[i];
		}
		return sumatorio;
	}
}
