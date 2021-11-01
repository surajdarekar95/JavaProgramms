package JavaEssentilas;

public class SearchingElementInArray20 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		boolean flag = false;
		int Search_Element = 30;

		for (int i = 0; i < a.length; i++) 
		{
			if (Search_Element == a[i]) 
			{
				System.out.println("Element Found At " + i);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Element Not Fount");
		}
	}

}
