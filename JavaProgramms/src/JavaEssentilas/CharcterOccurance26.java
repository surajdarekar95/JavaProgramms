package JavaEssentilas;

public class CharcterOccurance26 {

	public static void main(String[] args) {

		String s = "Java programming Java oops";
		int total_count = s.length();

		int totalCount_AfterRemoving = s.replace("J", "").length();

		int count = total_count - totalCount_AfterRemoving;

		System.out.println("Number Occurance of a is " + count);

	}

}
