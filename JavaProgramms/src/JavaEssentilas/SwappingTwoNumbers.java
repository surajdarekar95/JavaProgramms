package JavaEssentilas;

public class SwappingTwoNumbers {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("Before swapping..."+a+" " +b);
		
		//Logic 1
		
		/*int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping..."+a+" " +b);*/
		
		//logic 2 without using third variable
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping..."+a+" " +b);

		

		
	}

}
