package in.com.rays.Constructor;



public class Account {
	
private int balance = 0 ;
public Account(int balnce) {
	this.balance=balnce;
}
public void setBalance(int balance) {
	this.balance = balance;
}	
public int getBalance() {
	return balance;
}
public void deposit() {
	System.out.println("balance "+getBalance());
}
public void withdraw() {
	int less=getBalance()-50;
	System.out.println(less);
}
	
}