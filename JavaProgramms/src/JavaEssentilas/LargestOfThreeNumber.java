package JavaEssentilas;

public class LargestOfThreeNumber {

	public static void main(String[] args) {

		int a=100;
		int b=20;
		int c=30;
		
		//1.Logic
		
		/*if(a>b && a>c)
		{
			System.out.println("A is largest");
		}
		else if(b>a && b>c) 
		{
			System.out.println("B is largest");
		}
		else 
		{
			System.out.println("C is largest");

		}*/
		
		//2.Logic Ternary Operator
		
		int largest=a>b?a:b;
		int largest2=c>largest?c:largest;
		System.out.println(largest2+" is largest");
		
	}
	

}
