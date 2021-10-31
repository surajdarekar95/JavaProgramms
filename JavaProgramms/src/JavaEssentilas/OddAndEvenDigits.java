package JavaEssentilas;

public class OddAndEvenDigits {

	public static void main(String[] args) {

		int num=1444456;
		int Odd_Count=0;
		int Even_Count=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) 
			{
				Even_Count++;
			}
			else
			{
				Odd_Count++;
			}
			
			num=num/10;
		}
		
		System.out.println("Odd count"+Odd_Count);
		System.out.println("Even count"+Even_Count);


	}

}
