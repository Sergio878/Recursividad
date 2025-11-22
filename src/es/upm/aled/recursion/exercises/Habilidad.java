package es.upm.aled.recursion.exercises;

import java.util.List;

public class Habilidad {
	private String id;
	private int costePuntos; // Coste para desbloquear esta habilidad
	private List<Habilidad> desbloqueables; // Habilidades que dependen de esta
	
	public int getCoste () { 
		return this.costePuntos; 
	}
	public List<Habilidad> getDesbloqueables () { 
		return this.desbloqueables; 
	}
	public static int costeRamaCompleta(Habilidad raiz) {
		//Caso base
		if(raiz==null) return 0;
		//Caso recursivo
		int sum=raiz.costePuntos;
		if(raiz.getDesbloqueables()!=null) {
			for(Habilidad h: raiz.getDesbloqueables()) {
				sum+=costeRamaCompleta(h);
			}
		}
		return sum;
	}
}
