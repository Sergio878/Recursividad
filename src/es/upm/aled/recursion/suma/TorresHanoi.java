package es.upm.aled.recursion.suma;

public class TorresHanoi {
	//Lo implementaremos mostrando simplemente los movimientos
	//Recibe de parámetros el número de discos a mover y las tres torres
	public static void torresHanoi(int numDiscos, char origin, char torreAuxiliar, char destiny) {
		//Donde:
			//A-> Torre inicial
			//B-> Torre auxiliar
			//C-> Torre final
		//Implementación caso base
		if(numDiscos==1) {
			System.out.println("Muevo el disco de " + origin + " a " + destiny);
		} 
		//Implementación caso recursivo
		if(numDiscos>1) {
			//Primero, muevo los discos más pequeños a la torre auxiliar
			torresHanoi(numDiscos-1, origin, destiny, torreAuxiliar);
			//Segundo, muevo el disco más grande, que estaba aún en el origen, al destino
			//torresHanoi(numDiscos-1, A, B, C);
			System.out.println("Muevo el disco de " + origin + " a " + destiny);
			//Tercero, muevo los discos más pequeños al destino, desde la torre auxiliar
			torresHanoi(numDiscos-1, torreAuxiliar, origin, destiny);
		}
		
	}
	
	public static void main(String[] args) {
		torresHanoi(3, 'A', 'B', 'C');
	}
}
