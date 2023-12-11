package in.com.rays.io;

import java.io.FileWriter;

public class FileWriterTest {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\shubham\\Desktop\\input\\abcd.txt" , true);
		char[] arr = {'s','h','u','b','h','a','m'};
		file.write(arr);
		file.write('\n');
		file.write("rrrrrr");
		file.write('\n');
		file.write("55");
		file.close();
	}

}
