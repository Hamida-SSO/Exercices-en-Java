package Partie1;

public class TpJava06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(args[0]);
		int factorial =1;
		int i;
		
		if(number > 1) {
			for (i=1 ; i<= number; i++) {
				factorial = factorial * i;
			}
			System.out.println(factorial);
		}
		else {
			System.out.println("Number must be upper 1");
		}
		
		/* 
		 int factorial = number;
		 
		 for(i = number-1, i>1; i--) {
		 	factorial*=i;
		 }
		 System.out.println(factorial);
		 * */
		
	}

}
