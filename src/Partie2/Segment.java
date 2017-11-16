package Partie2;


import java.util.Collection;
import java.util.HashSet;

public class Segment extends Figure {

	private Point start;
	private Point end;
	private int lengths;
	private boolean type;

	public Segment(Point p, int l, boolean h) {
		this.type = h;
		this.lengths = l;
		this.start = p;
	}

	public Point getPointStart() {
		return start;
	}

	public Point getPointEnd() {
		if (this.type) {
			end = new Point(start.getX() + this.lengths, start.getY());
		}
		end = new Point(start.getX(), start.getY() + this.lengths);
		return end;
	}

	public String toString() {
		return "[ SEG " + getPointStart() + getPointEnd() + "]";
	}

	public Collection<Point> getPoints() {

		// Pas de doublon, ni d'ordre
		Collection<Point> points = new HashSet<Point>();

		points.add(this.start);
		points.add(this.end);

		return points;
	}

	@Override
	public boolean covers(Point p) {
		// if type == horizontal
		if(type) {
			if((p.getX() >= this.getPointStart().getX()) && (p.getX() <= this.getPointEnd().getX())) {
				return true;
			}
		}
		else {
			if((p.getY() >= this.getPointStart().getY()) && (p.getY() <= this.getPointEnd().getY())) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Point getCenter() {
		int x = (getPointStart().getX() + getPointEnd().getX()) / 2;
		int y = (getPointStart().getY() + getPointEnd().getY()) / 2;
		return new Point(x, y);
	}
}
