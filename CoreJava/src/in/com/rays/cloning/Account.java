package in.com.rays.cloning;

public class Account implements Cloneable {
	
	public int balance = 0;
	
	public Account(int balance) {
		this.balance = balance;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	 
}
