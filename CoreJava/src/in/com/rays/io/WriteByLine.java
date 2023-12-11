package in.com.rays.io;

import java.io.FileWriter;

public class WriteByLine {
	
	public static void main(String[] args) throws Exception{
		
		FileWriter file = new FileWriter("C:\\Users\\shubham\\Desktop\\input\\abc.txt" , true);
		
		file.write("how are you\n");
		file.write("this is one line");
		//System.out.println(C:\\Users\\shubham\\Desktop\\input\\hello.txt);
		file.close();
	}
	}
