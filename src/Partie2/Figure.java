package Partie2;

import java.util.Collection;

import Partie3.Color;

public abstract class Figure {
	
	public void display() {
		System.out.println(this.toString());
	}
	
	public abstract Collection<Point> getPoints();
	
	public abstract boolean covers(Point p);
	
	public abstract Point getCenter(); 
	
/*	public double distanceOrigin() {
		
	};
	
	public int compareTo(Figure f) {
		
	} */
	
	public Color getColor() {
		return Color.getColorDefault();
	};
	
}
