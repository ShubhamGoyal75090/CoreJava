package in.com.rays.Constructor;

public class TestAccount {

	public static void main(String[] args) {
		Account ac = new Account(500);
		ac.deposit();
		ac.withdraw();
//		ac.setBalance(100);
//		System.out.println("total amount" + ac.getBalance());
//		ac.withdraw();

	}

}
