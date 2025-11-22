package es.upm.aled.recursion.exercises;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private double salario;
	private List<Empleado> subordinados; // Lista de empleados a su cargo
	
	public Empleado (String nombre, double salario) { 
		this.nombre=nombre;
		this.salario=salario;
		this.subordinados=new ArrayList<Empleado>();
	}
	public double getSalario () { 
		return this.salario; 
	}
	public List<Empleado> getSubordinados () { 
		return this.subordinados; 
	}
	public static double presupuestoEquipo(Empleado jefe) {
		//Caso base
		if(jefe.getSubordinados()==null) {
			return jefe.getSalario();
		}
		//Caso recursivo
		double sum=jefe.getSalario();
		for(Empleado e: jefe.getSubordinados()) {
			sum+=presupuestoEquipo(e);
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
	}
}
