package JavaEssentilas;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int[] a = { 2, 7, 8, 6, 4 ,3};
		int sum = 0;

		/*
		  for (int i = 0; i <= a.length - 1; i++)
		   {
		   sum = sum + a[i]; 
		   }
		  System.out.println("Sum of elements in array is.." + sum);
		 */

		// Using Enhanced fro loop

		for (int value : a) {
			sum = sum + value;
		}
		System.out.println("Sum of elements in array is.." + sum);

	}

}
