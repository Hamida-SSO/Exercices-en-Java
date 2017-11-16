package Partie2;

import java.util.Collection;
import java.util.HashSet;

public class Rectangle extends Figure implements Surfacable {

	private Point pointBottomRight, pointBottomLeft, pointTopRight, pointTopLeft;
	private int lengths;
	private int widths;

	public Rectangle(Point p, int l, int w) {
		pointBottomLeft = p;
		lengths = l;
		widths = w;
	}

	public int getLength() {
		return lengths;
	}

	public int getWidth() {
		return widths;
	}

	public Point getPointBottomLeft() {
		return pointBottomLeft;
	}

	public Point getPointTopLeft() {
		pointTopLeft = new Point(pointBottomLeft.getX(), pointBottomLeft.getY() + widths);
		return pointTopLeft;
	}

	public Point getPointBottomRight() {
		pointBottomRight = new Point(pointBottomLeft.getX() + lengths, pointBottomLeft.getY());
		return pointBottomRight;
	}

	public Point getPointTopRight() {
		pointTopRight = new Point(pointBottomLeft.getX() + lengths, pointBottomLeft.getY() + widths);
		return pointTopRight;
	}

	public String toString() {
		return "[ RECT " + getPointBottomLeft() + getPointTopLeft() + getPointBottomRight() + getPointTopRight() + "]";
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Point> getPoints() {

		// Pas de doublon, ni d'ordre
		Collection<Point> points = new HashSet<Point>();

		points.add(getPointBottomLeft());
		points.add(getPointBottomRight());
		points.add(getPointTopLeft());
		points.add(getPointTopRight());

		return points;
	}

	@Override
	public boolean covers(Point p) {
		if(p.getX() <= getPointBottomRight().getX()) {
			return false;
		}
		if(p.getX() >= getPointTopLeft().getX()) {
			return false;
		}
		if(p.getY() <= getPointTopLeft().getY() ) {
			return false;
		}
		if(p.getY() >= getPointTopRight().getY()) {
			return false;
		}
		return true;
	}

	@Override
	public Point getCenter() {
		int x = (this.getPointBottomRight().getX() + this.getPointTopLeft().getX()) / 2;
		int y = (this.getPointBottomRight().getY() + this.getPointTopLeft().getY()) / 2;
		return new Point(x, y);
	}

}
