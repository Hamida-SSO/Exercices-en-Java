package Partie2;

public class Square2 extends Rectangle implements Surfacable {

	public Square2 (Point p, int l, int w) {
		super(p,l,w);
	}

	public String toString() {
		return "[ CARRE "+ getPointBottomLeft() + getPointTopLeft() + getPointBottomRight() + getPointTopRight()+ "]";
	}
}
