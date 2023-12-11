package in.com.rays.io;

import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) throws Exception{
		
		FileReader file = new FileReader("C:\\Users\\shubham\\Desktop\\input\\hello.txt");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		file.close();
	}

}
