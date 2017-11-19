package introductionAuxTechnologiesJAVA;

public class TpJava01 {

	/* ================================== 
	 * 	Arguments de la ligne de commande
	 * ===================================
	 * */
	public static void main(String[] args) {
		
		int numberArgument = args.length;
		int counter;
		
		for(counter = 0; counter < numberArgument; counter++) {
			System.out.println("Bonjour " + args[counter]);
		}
	}

}
