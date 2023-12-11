package in.com.rays.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public String id = null;
	public String firstname = null;
	public String lastname = null;
	public double salary = 0;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(firstname);
		out.writeObject(lastname);
		out.writeDouble(salary);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (String) in.readObject();
		firstname = (String) in.readObject();
		lastname = (String) in.readObject();
		salary = in.readDouble();
	}

}
