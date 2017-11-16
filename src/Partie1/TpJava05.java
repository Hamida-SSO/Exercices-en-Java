package Partie1;

public class TpJava05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int weight = Integer.parseInt(args[0]);
		String size = "";
		switch(weight) {
			case 0:
			size = "Not bag";
			break;
			case 1:
				size = "small";
				break;
			case 2:
				size = "mmedium";
				break;
			default:
				size = "large";
				
		}
		System.out.println("bag : " + size); */
		
		int  prime = Integer.parseInt(args[0]);
		int  counter = 0;
	 	while(counter < prime) {
			System.out.println(counter);
			counter++;
		}
		
	/*	do {
			System.out.println(counter);
			counter++;	
		}while(counter < prime);*/
	}

}
