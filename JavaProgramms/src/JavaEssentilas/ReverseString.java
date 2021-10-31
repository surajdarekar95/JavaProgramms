package JavaEssentilas;

public class ReverseString {

	public static void main(String[] args) {

		// 1.Using concatination operator

		String str = "ABCD";
		String rev = "";
		/*int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Revesed string is...." + rev);*/
		
		//2.Using chat array
		
		/*char[]a=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("String reversed.."+rev);*/
		
		//3.Using string bufferclass
		
		StringBuffer sb= new StringBuffer(str);

		System.out.println(sb.reverse());
	}

}
