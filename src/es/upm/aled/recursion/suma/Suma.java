package es.upm.aled.recursion.suma;

public class Suma {
	
	public static void main(String[] args) {
		int resultado= suma(5);
		System.out.println(resultado);
	}
	
	public static int suma(int n) { 
		//Suma todos los enteros del 1 al n
		if(n==1) {
			return 1;
		}
		return n + suma(n-1);
	}
}
