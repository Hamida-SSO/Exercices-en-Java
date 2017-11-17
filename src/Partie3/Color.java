package Partie3;

public enum Color {
	Red ("R"),
	Green ("G"),
	Blue ("B"),
	Yellow ("Y"),
	Black ("#");
	
	private String abbreviation;
	
	Color(String ab) {
		this.abbreviation = ab;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}
	
	public static Color getColorDefault() {
		return Color.Black;
	}
	
	public void display() {
		System.out.println(this.toString());
	}
}
