package Partie1;

public class TpJava07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(args[0]);
		int counter =0;
		int firstPotential = 0; 
		int divisorPotential; 
		boolean isPrime = true;

		
		while (counter < number) { // Possiblit� de mettre une �tiquette plus besoin du boolean � voir
			for(divisorPotential=2; divisorPotential<firstPotential; divisorPotential++) {
				if(firstPotential%divisorPotential == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				
				System.out.println(firstPotential);
				counter++;
				
			}
			firstPotential++;
		}

	}

}
