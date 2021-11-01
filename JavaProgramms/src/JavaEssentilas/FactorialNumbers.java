package JavaEssentilas;

public class FactorialNumbers {

	// A factotiral is a function that multiplies a number by every number below it
	// Eg. 5!=5*4*3*2*1=120

	public static void main(String[] args) {

		int num =10 ;
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a number is.." + factorial);
	}

}
