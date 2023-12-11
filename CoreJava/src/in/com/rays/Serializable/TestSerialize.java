package in.com.rays.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialize {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("C:\\Users\\shubham\\Desktop\\input\\cccc.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();
		m.name = "shubham";
		m.maths = 85;
		m.physics = 75;
		m.chemistry = 74;
		m.total = m.maths + m.physics + m.chemistry;
		out.writeObject(m);
		out.close();
		file.close();
	}

}
