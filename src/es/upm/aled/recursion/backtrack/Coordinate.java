package es.upm.aled.recursion.backtrack;

import java.util.Objects;

public class Coordinate {
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}//en un sentido es muy rápida de hacer y en otro no
	//es una marca única para que haga origen
	//devuelve un numero entero

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		return ((this.x == other.x) && (this.y == other.y));
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	public int getY() {
		return y;
	}
	
	
	
}
