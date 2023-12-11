package in.com.rays.Externalizable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadExternalize {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\shubham\\Desktop\\input\\shubham.txt");
		ObjectInputStream in = new ObjectInputStream(file);

		Employee e = (Employee) in.readObject();

		System.out.println(e.id);
		System.out.println(e.firstname);
		System.out.println(e.lastname);
		System.out.println(e.salary);

		in.close();
		file.close();

	}

}
