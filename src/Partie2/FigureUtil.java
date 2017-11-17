package Partie2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Partie3.Color;

public class FigureUtil {

	private int max = 99;
	private int min = 0;

	public FigureUtil() {

	}

	public Circle getRandomCircle() {

		Point point = getRandomPoint();
		int radius = numberRandom(min, max);
		Color color = getRandomColor();

		return new Circle(point, radius, color);
	}

	public Rectangle getRandomRectangle() {

		Point point = getRandomPoint();
		int widhts = numberRandom(min, max);
		int lenghts = numberRandom(min, max);
		Color color = getRandomColor();

		return new Rectangle(point, lenghts, widhts, color);
	}

	public Rectangle getRandomCarre() {

		Point point = getRandomPoint();
		int size = numberRandom(min, max);
		Color color = getRandomColor();

		return new Rectangle(point, size, size, color);
	}

	public Segment getRandomSegment() {
		Point point = getRandomPoint();
		int size = numberRandom(min, max);
		int number = numberRandom(0, 1);
		boolean what = false;
		Color color = getRandomColor();

		if (number == 1) {
			what = true;
		}

		return new Segment(point, size, what,color);
	}

	public Figure getRandomFigure() {
		int choice = numberRandom(0, 4);

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
		int choice = numberRandom(0, 3);

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

		for (i = 0; i <= number; i++) {
			figures.add(getRandomFigure()); // number figure car ArrayList accepte les doublons
		}

		return figures;
	}

	public Collection<Figure> getPoints(ArrayList<Figure> figures) {

		int size = figures.size();
		Collection<Figure> listPoints = new ArrayList<>();

		while (size != 0) {
			((ArrayList<Figure>) listPoints).get(size).getPoints();
			size--;
		}

		return listPoints;
	}

	public static Figure getFigureEn(Point p, Picture d) {
		Iterator<Figure> iterator = d.getFigures().iterator();

		while (iterator.hasNext()) {
			Figure f = iterator.next();
			if (f.covers(p)) {
				return f;
			}
		}
		return null;
	}

	public Color getRandomColor() {
		int number = numberRandom(0, 5);
		switch (number) {
		case 0:
			return Color.Red;
		case 1:
			return Color.Green;
		case 2:
			return Color.Blue;
		case 3:
			return Color.Yellow;
		default:
			return Color.Black;
		}
	}
	//TODO teste les couleurs sur deux figures

	public Point getRandomPoint() {
		int x = numberRandom(min, max);
		int y = numberRandom(min, max);
		return new Point(x, y);
	}

	private int numberRandom(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

}
