package in.com.rays.io;

import java.io.FileReader;

public class ReadByChar {
	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\shubham\\Desktop\\input\\hello.txt");
		int ch = in.read();

		while (ch != -1) {
			System.out.print((char) ch);
			ch = in.read();

		}

		
		in.close();
		
	}
	
}
