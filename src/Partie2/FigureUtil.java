package Partie2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class FigureUtil {

	private int max = 99;
	private int min = 0;

	public FigureUtil() {

	}

	public Circle getRandomCircle() {

		Point point = getRandomPoint();
		int radius = numberRandom(min, max);

		return new Circle(point, radius);
	}

	public Rectangle getRandomRectangle() {

		Point point = getRandomPoint();
		int widhts = numberRandom(min, max);
		int lenghts = numberRandom(min, max);

		return new Rectangle(point, lenghts, widhts);
	}

	public Rectangle getRandomCarre() {

		Point point = getRandomPoint();
		int size = numberRandom(min, max);

		return new Rectangle(point, size, size);
	}

	public Segment getRandomSegment() {
		Point point = getRandomPoint();
		int size = numberRandom(min, max);
		int number = numberRandom(0, 1);
		boolean what = false;

		if (number == 1) {
			what = true;
		}

		return new Segment(point, size, what);
	}

	public Figure getRandomFigure() {
		int choice = numberRandom(0, 3);

		switch (choice) {
		case 0:
			return getRandomCircle();

		case 1:
			return getRandomRectangle();

		case 2:
			return getRandomCarre();

		default:
			return getRandomSegment();

		}

	}

	public Surfacable getRandomSurfacable() {
		int choice = numberRandom(0, 2);

		switch (choice) {
		case 0:
			return getRandomCircle();

		case 1:
			return getRandomRectangle();

		default:
			return getRandomCarre();
		}

	}
	
	// A revoir par rapport à la correction
	public ArrayList<Figure> generate(int number) {
		int i;
		ArrayList<Figure> figures = new ArrayList<>();
		
		for(i=0; i<= number; i++) {
			 figures.add(getRandomFigure()); // number figure car ArrayList accepte les doublons
		}
		
		return figures;
	}
	
	public Collection<Figure> getPoints(ArrayList<Figure> figures) {
		
		int size = figures.size();
		Collection<Figure> listPoints = new ArrayList<>();
		
		while(size !=0) {
			((ArrayList<Figure>) listPoints).get(size).getPoints();
			size--;
		}
		
		return listPoints;
	}
	
	public static Figure getFigureEn(Point p, Picture d) {
		Iterator<Figure> iterator = d.getFigures().iterator();
		
		while(iterator.hasNext()) {
			Figure f = iterator.next();
			if(f.covers(p)) {
				return f;
			}
		}
		return null;
	}
	
	

	private Point getRandomPoint() {
		int x = numberRandom(min, max);
		int y = numberRandom(min, max);
		return new Point(x, y);
	}

	private int numberRandom(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

}
