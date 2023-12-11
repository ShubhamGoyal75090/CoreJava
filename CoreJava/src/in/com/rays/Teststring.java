package in.com.rays;

public class Teststring {
	// string is a immutable//

public static void main(String[] args) {
	String s1= "Shubham Goyal";
	
	int count=0;
	
	
	for(char ch= 'a'; ch <= 'z'; ch++) {

	
	for (int i = 0; i < s1.length(); i++) {
		
	//	System.out.println(s1.charAt(i));
		
		
		if (s1.charAt(i)== ch) {
		
			
			count++;
		}
	
	}
	if (count>0) {
		System.out.println(ch+"count= "+count);
		
		
	}
	count=0;
}

}
}

