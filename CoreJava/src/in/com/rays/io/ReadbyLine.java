package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadbyLine {
	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("C:\\Users\\shubham\\Desktop\\input\\hello.txt");
		
		BufferedReader out = new BufferedReader(file);
		String line = out.readLine();
		while (line != null) {
			System.out.println(line);
			line = out.readLine();
			
		}
		file.close();
	}

}
