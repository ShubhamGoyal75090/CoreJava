package in.com.rays.inter;

public class Testinter {
	
	public static void main(String[] args) {
		
		Richman rm = new Businessman();
		rm.earnMoney();
		rm.donation();
		rm.party();
		
		Socialworker sw = new Businessman();
		sw.helpToOthers();
		
		System.out.println(Richman.ABC);
		
	}
	

}
