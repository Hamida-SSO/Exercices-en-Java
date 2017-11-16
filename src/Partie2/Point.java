package Partie2;

public class Point {
	private int abscissa;
	private int ordinate;
	
	public static final int INIT_X = 25;
	public static final int INIT_Y = 25;
	
	public Point(int x, int y ) {
		this.abscissa = x;
		this.ordinate = y;
	}
	
	public Point() {
		this(INIT_X, INIT_Y);
	}
	
	public int getX() {
		return abscissa;
	}
	
	public int getY() {
		return ordinate;
	}
	
	public void setX(int x) {
		abscissa = x;
	}
	
	public void setY(int y) {
		ordinate = y;
	}
	
	public String toString() {
		return "["+abscissa+";"+ordinate+"]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		return ((this.abscissa == p.abscissa) && (this.ordinate == p.ordinate)); 
	}
	
	public double distance (Point p)  {
		double x = Math.pow(this.getX() - p.getX(),2);
		double y = Math.pow(this.getY() - p.getY(),2);
		double result = Math.sqrt(x+y);
		return result;
	}
}
