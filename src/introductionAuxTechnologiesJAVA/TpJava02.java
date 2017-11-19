package introductionAuxTechnologiesJAVA;

public abstract class TpJava02 {
	
	/* ================================== 
	 * 	Conversion & Primitives
	 * ===================================
	 * */

	public static void main(String[] args) {
		// Les problèmes de conversions qu'on peut rencontrer
	
		int val = 1234;
		float valF = val;
		System.out.println("\n" + val);
		System.out.println("\n" + valF);
		
		val = 123456789;
		valF = 123456789;
		System.out.println("\n" + val);
		System.out.println("\n" + valF);
		
		float x = 15F;
		float z = 0F;
		float y = -123F;
		float a = x/y;
		float b = y/z;
		float c = a/b;
		float autre = a+b;

		System.out.println("\n" + a);
		System.out.println("\n" + b);
		System.out.println("\n" + c);
		System.out.println("\n" + autre);
		
		long test = Long.MAX_VALUE;
		System.out.println(test);
		System.out.println(test+2);
		
		
		
	}

}
