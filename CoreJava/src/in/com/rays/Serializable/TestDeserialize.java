package in.com.rays.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialize {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\shubham\\Desktop\\input\\cccc.txt");
		ObjectInputStream in = new ObjectInputStream(file);

		Marksheet m = (Marksheet) in.readObject();

		System.out.println(" Name =" + m.name);
		System.out.println(" maths =" + m.maths);
		System.out.println(" physics =" + m.physics);
		System.out.println(" chemistry =" + m.chemistry);
		System.out.println("total=" + m.total);

		in.close();
		file.close();

	}

}
