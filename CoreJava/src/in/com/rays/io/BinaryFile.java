package in.com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryFile {

	public static void main(String[] args) throws Exception {

		String source = "C:\\Users\\shubham\\Desktop\\pic\\dsl.png";
		String target = "C:\\Users\\shubham\\Desktop\\input\\pics.png";
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch=in.read();

		}
		in.close();
		out.close();

	}

}
