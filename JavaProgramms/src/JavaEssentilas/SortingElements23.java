package JavaEssentilas;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements23 {

	public static void main(String[] args) {

		// Approach 1
		/*int a[] = { 50, 40, 10, 80, 20 };
		System.out.println("Array before sorting" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting" + Arrays.toString(a));*/
		
		//Approach 2
		/*int a[] = { 50, 40, 10, 80, 20 };
		System.out.println("Array before sorting" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting" + Arrays.toString(a));*/
		

		//Approach 3.Sorting in reverse order
		Integer a[] = { 50, 40, 10, 80, 20 };
		System.out.println("Array before sorting" + Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting" + Arrays.toString(a));
	}

}
