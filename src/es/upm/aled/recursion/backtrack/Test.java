package es.upm.aled.recursion.backtrack;

public class Test {
	
	
	public static void main(String[] args) {
		Coordinate sitio1= new Coordinate(4,3);
		Coordinate sitio2= new Coordinate(4,3);
		boolean iguales= sitio1.equals(sitio2);
		
		System.out.println("¿Son iguales? " + iguales);
		
		//da false pq aunq tienen las mias coordenadas son objetos diferentes en memoria
		//hay que definir metodo equals: con ese ya da true
	}
}
