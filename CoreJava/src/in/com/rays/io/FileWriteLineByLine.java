package in.com.rays.io;

import java.io.FileWriter;

import java.io.PrintWriter;

public class FileWriteLineByLine {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\shubham\\Desktop\\input\\ab.txt", true);
		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i <= 5; i++) {
			pw.println("line");
			

		}
		pw.close();
		file.close();

	}

}
