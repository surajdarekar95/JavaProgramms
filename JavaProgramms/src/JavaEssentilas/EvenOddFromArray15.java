package JavaEssentilas;

public class EvenOddFromArray15 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Even numbers from array");

		for (int i = 0; i <= a.length - 1; i++) 
		{
			if (a[i] % 2 == 0) 
			{
				System.out.println(a[i]);
			}
		}

		System.out.println("Odd numbers from array");

		for (int i = 0; i <= a.length - 1; i++) 
		{
			if (a[i] % 2 != 0) 
			{
				System.out.println(a[i]);
			}
		}
	}

}
