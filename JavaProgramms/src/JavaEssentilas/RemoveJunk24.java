package JavaEssentilas;

public class RemoveJunk24 {

	public static void main(String[] args) {

		String s = "!@#$%^&* suraj darekar 8806651424";
		String s1 = "87654321@#$%&*&%Suraj";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		s1 = s1.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s1);

	}

}
