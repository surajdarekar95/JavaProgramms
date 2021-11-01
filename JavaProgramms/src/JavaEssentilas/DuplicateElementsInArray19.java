package JavaEssentilas;

public class DuplicateElementsInArray19 {

	public static void main(String[] args) {

		String arr[] = { "java","c","c++","Python","Java" };
		
	
		
		boolean falg=false;
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("Found Duplicate Element is "+arr[i]);
					falg=true;
				}
			}
		}
		
		if(falg==false) 
		{
			System.out.println("Duplicate element not found");
		}

	}

}
