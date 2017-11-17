package Partie2;

import java.util.Collection;
import java.util.HashSet;

public class Circle extends Figure implements Surfacable {
	private int radius;
	private Point center;

	public Circle(Point p, int r) {
		radius = r;
		center = p;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int r) {
		radius = r;
	}

	public Point getCenter() {
		return this.center;
	}

	public String toString() {
		return "[ CIRCLE " + center.toString() + " , " + radius + "]";
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection<Point> getPoints() {

		// Pas de doublon, ni d'ordre
		Collection<Point> points = new HashSet<Point>();

		points.add(this.getCenter());

		return points;
	}


	@Override
	public boolean covers(Point p) {
		return getCenter().distance(p) <= getRadius();
	}

	@Override
	public boolean equals(Object figure) {
		
		return (((Circle) figure).getCenter() == this.getCenter() && ((Circle) figure).getRadius() == this.getRadius());
	}

}
