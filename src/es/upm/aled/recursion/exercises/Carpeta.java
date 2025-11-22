package es.upm.aled.recursion.exercises;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; // Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; // Carpetas dentro de esta carpeta
	
	public Carpeta (String nombre) { 
		this.nombre=nombre;
		this.archivos=new ArrayList<Archivo>();
		this.subcarpetas=new ArrayList<Carpeta>();
	}
	public List<Archivo> getArchivos () { 
		return this.archivos; 
	}
	public List<Carpeta> getSubcarpetas () { 
		return this.subcarpetas; 
	}
	
	public static double calcularPesoTotal(Carpeta inicio) {
		double sum=0;
		
		//Caso base
		if(inicio==null)
			return 0.0;
		
		//Sumar archivos
		if(inicio.getArchivos().size()!=0) {
			for(int i=0; i<inicio.getArchivos().size();i++) {
				
				sum+=inicio.archivos.get(i).getPesoMB();
			}
		}
		//Sumar subcarpetas
		if(inicio.getSubcarpetas().size()!=0) {
			for(int i=0; i<inicio.getSubcarpetas().size(); i++) {
				sum+=calcularPesoTotal(inicio.subcarpetas.get(i));
			}
		}
		
		return sum;
	}
	
	public static double calcularPesoTotalI(Carpeta inicio) {
		double total=0;
		
		for(Archivo archivo: inicio.getArchivos()) {
			total+=archivo.getPesoMB();
		}
		for(Carpeta subcarpeta: inicio.getSubcarpetas()) {
			total+=calcularPesoTotal(subcarpeta);
		}
		return total;
	}
	
}
