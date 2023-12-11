package in.com.rays.Externalizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteExternalizable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();
		e.id = "abc";
		e.firstname = "shubham";
		e.lastname = "goyal";
		e.salary = 20000;

		FileOutputStream file = new FileOutputStream("C:\\Users\\shubham\\Desktop\\input\\shubham.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(e);

		out.close();
		file.close();

		System.out.println("Object Write Successfully....!!!");

	}

}
