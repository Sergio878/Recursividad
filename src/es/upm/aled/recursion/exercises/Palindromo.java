package es.upm.aled.recursion.exercises;

public class Palindromo {
	public static boolean esPalindromo(String texto) {
		if(texto.length()==0) return true;
		if(texto.length()==1) return true;
		
		if(texto.charAt(0)!=texto.charAt(texto.length()-1)) {
			return false;
		} return esPalindromo(texto.substring(1,texto.length()-1));
	}
	public static void main(String[]args) {
		String s= "ojo rojo";
		//s.split(".");
		//System.out.println(s.split("."));
		System.out.println("¿Es palíndromo?: " + esPalindromo(s));
		
	}
}
