package JavaEssentilas;

public class RemoveWhiteSpaces25 {

	public static void main(String[] args) {

		String s1 = "Java    programming selenium   automation";
		s1 = s1.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
