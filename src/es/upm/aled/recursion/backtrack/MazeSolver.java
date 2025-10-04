package es.upm.aled.recursion.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Mirar laberinto despues
public class MazeSolver {
	
	private String[] maze;
	private char wall;
	private Coordinate start;
	private Coordinate end;
	private List<Coordinate> path;
	private Set<Coordinate> visited;
	
	public MazeSolver(String[] maze, char wall, Coordinate start, Coordinate end) {
		super();
		this.maze = maze;
		this.wall = wall;
		this.start = start;
		this.end = end;
		this.path=new ArrayList<Coordinate>();
		this.visited= new HashSet<Coordinate>();
	}
	
	//Método recursivo
	private boolean walk(Coordinate current) {//va a la coordenada, y 
		//si no se cumple uno de loscuatro casos, miro en no de los casos de alrededor
		
		//PASO RECURSIVO: chequea arriba, abajo, izquierda y derecha
		
		//CASOS BASES: PUNTOS DONDE DEJO DE LLAMAR DE NUEVO AL MÉTODO RECURSIVO
		
		
		path.add(current);
		
		//Caso base: no esta llamando a walk()
		
		//Estoy fuera?
		if(current.getX()>= maze[0].length() || current.getX()>0 ||
				current.getY()>= maze.length || current.getY()>0) return false;
			//La X se sale por la derecha; por la izquierda
			//La Y por la derecha o por la izquierda
		
		//Estoy en el muro?
		if(maze[current.getY()].charAt(current.getX())==wall) return false;
		
		//Estoy en la salida?
		if(current.getX() == end.getX() && current.getY() == end.getY()) return true;
		
		//He estado antes?
		if(visited.contains(current)) {
			return false;
		}
		
		//Paso recursivo: up, right, down, left:
				Coordinate up= new Coordinate(current.getX(), current.getY()-1);
				Coordinate right= new Coordinate(current.getX()+1, current.getY());
				Coordinate down= new Coordinate(current.getX(), current.getY()+1);
				Coordinate left= new Coordinate(current.getX()-1, current.getY());
				
				Coordinate toVisit[] = new Coordinate[4];
				toVisit[0]=up;
				toVisit[1]=right;
				toVisit[2]=down;
				toVisit[3]=left;
				
				for(Coordinate next: toVisit) {
					if(this.walk(next)) {
						return true;
					}
					//si esto es true --> el camino es por ahi: camino al destino
				}
				
			
			
		
		return false;
	}
	
	//Método fachada
	public List<Coordinate> solve() {
		this.walk(start);
		return path;
	}
	//Mirar por debug con laberinto 2 donde falla
	
	
	
	
	
	
	
	
	
}
