package Partie2;

import java.util.Collection;

public abstract class Figure {
	
	public void display() {
		System.out.println(this.toString());
	}
	
	public abstract Collection<Point> getPoints();
	
	public abstract boolean covers(Point p);
	
	public abstract Point getCenter(); 
	
}
