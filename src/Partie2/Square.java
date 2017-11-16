package Partie2;

public class Square {
	private Point pointBottomRight, pointBottomLeft, pointTopRight, pointTopLeft;
	private int size;

	public Square(Point p, int s) {
		pointBottomLeft = p;
		size = s;
	}

	public int getSize() {
		return size;
	}

	public Point getPointBottomLeft() {
		return pointBottomLeft;
	}

	public Point getPointTopLeft() {
		pointTopLeft = new Point(pointBottomLeft.getX(), pointBottomLeft.getY() + size);
		return pointTopLeft;
	}

	public Point getPointBottomRight() {
		pointBottomRight =  new Point(pointBottomLeft.getX() + size, pointBottomLeft.getY());
		return pointBottomRight;
	}

	public Point getPointTopRight() {
		pointTopRight = new Point(pointBottomLeft.getX() + size,  pointBottomLeft.getY()+ size);
		return pointTopRight;
	}

	public String toString() {
		return "[ CARRE "+ getPointBottomLeft() + getPointTopLeft() + getPointBottomRight() + getPointTopRight()+ "]";
	}

}
