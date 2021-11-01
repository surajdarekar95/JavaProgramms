package JavaEssentilas;

public class MaxAndMinNumberinArray18 {

	public static void main(String[] args) {

		int a[] = { 100, 200, 50, 800, 500 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max)
			{
				max = a[i];

			}
		}

		System.out.println("Maximum number in array is.." + max);

		int min = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] < min) 
			{
				min = a[i];

			}
		}

		System.out.println("Minumum number in array is.." + min);

	}

}
