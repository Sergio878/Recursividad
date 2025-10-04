package es.upm.aled.recursion.data;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private List<Persona> hijos; //se puede inicializar la lista aqui tambien
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.hijos=new ArrayList<Persona>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getHijos() {
		return hijos;
	}

	public void setHijos(List<Persona> hijos) {
		this.hijos = hijos;
	}

	public void addHijo(Persona p) {
		//TODO
		//Añado el hijo si no era hijo ya
		if(!hijos.contains(p))
			hijos.add(p);
		
		
	}

	public String descendientes() {
		//TODO; devuelve un String con todos los descendientes
		//Seguro que hay que llamar de nuevo a descendientes
		String descendientes="";
		//Recorremos la lista de hijos y le pedimos que nos devuelva sus elementos:
		for(Persona hijo: hijos) {
			
			if(hijo.hijos==null) {
				return ("Último descendiente: " + hijo.getNombre());
			}
			
			descendientes +=  (hijo.getNombre() + ", " +  hijo.descendientes());
			
		}	
		return descendientes;
	}
	
	//En clase jueves 2 de octubre
	
	public String descendiente() {
		
		String misDescendientes=this.nombre + ": ";
		
		//Caso base
		if(this.hijos.size()==0) {//sobre el primero de los hijos de Rodrigo
			return this.nombre;
		}
		//Paso recursivo
		for(Persona hijo: hijos) {
			String descendientes= hijo.descendientes();
			misDescendientes= misDescendientes  +  hijo.nombre +  ", " + descendientes ;
			//concateno los descendientes de todos mis hijos
		}	
		return misDescendientes;
		
		//En recursividad debe haber un if que me lleve al caso base, porque si no
		//entro así, nunca voy a parar
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona ro= new Persona("Rodrigo");
		Persona no= new Persona("Nora");
		ro.addHijo(no);
		Persona afro= new Persona("Afrodita");
		Persona lu= new Persona("Luis");
		no.addHijo(lu);
		Persona ra= new Persona("Ramona");
		no.addHijo(ra);
		System.out.println(ro.descendiente());
	}
}
