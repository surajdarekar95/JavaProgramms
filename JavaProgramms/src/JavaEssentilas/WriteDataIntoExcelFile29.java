package JavaEssentilas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoExcelFile29 {

	public static void main(String[] args) throws IOException {

		FileWriter fw= new FileWriter("C:\\Sc\\suraj1.txt");
		
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("suraj");
		bw.write("darekar");
		bw.write("from  satara0");
		
		System.out.println("finished");
	}

}
