package Partie1;

public class TpJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float amount = Float.parseFloat(args[0]);
		float discount=0;
		float result =0;
		
		if ((amount >=1000) && (amount <2000)) {
			discount = 1;
			result = amount *(1-discount/100);

		}
		else if ((amount >=2000) && (amount <5000)) {
			discount = 3;
			result = amount *(1-discount/100);
		}
		else {
			discount =5;
			result = amount *(1-discount/100);
			System.out.println("Remise de 5% = " + result);
		}
		result = amount -result;
		
		if ( amount <1000) {
			discount = 0;
			result = amount;
		}
		System.out.println("Remise de " +discount+"% = " + result);
		
		
		
	}

}
