package Partie2;

import java.util.ArrayList;
import java.util.Collection;

public class Picture {
	/*  
	 * Rapide en lecture
	 * Pas besoin d'un accès en début et fin
	 * 
	 * Tenir compte des doublons, car possibilité d'avoir un dessin sur un autre
	 * L'ordre est important, puisqu'une figure dessiné avant un autre sera au desus
	 	Voir la correction
	 **/
	
	private Collection<Figure> figures; 
	
	public Picture() {
		this.figures = new ArrayList<Figure>();
	}
	
	public boolean add(Figure figure) {
		return testFigure(figure);
	}
	
	public Collection<Figure> getFigures() {
		return this.figures;
	}
	

	private boolean testFigure(Object o) {
		boolean test = false;
		if ((o instanceof Figure) && (o != null)) {
			test = true;
		}
		return test ;
	}
}
