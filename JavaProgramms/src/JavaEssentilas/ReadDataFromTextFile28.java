package JavaEssentilas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile28 {

	public static void main(String[] args) throws IOException {
		
		//Approach 1
		/*FileReader fr = new FileReader("C:\\Sc\\suraj.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}

		br.close();*/
		
		//Approach 2
		
		File file= new File("C:\\\\Sc\\\\suraj.txt");
		Scanner sc = new Scanner(file);
		
		/*while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 3
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
