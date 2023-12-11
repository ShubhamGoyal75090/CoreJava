package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardRead {
	public static void main(String[] args) throws Exception {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(in);
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\shubham\\Desktop\\input\\abcde.txt", true));
		String line = read.readLine();
		while (!line.equals("quit")) {
			pw.println(line);
			line = read.readLine();

		}
		read.close();
		pw.close();

	}

}
