package in.com.rays;

public class Pyramidstarpattern {
	
public static void main(String[] args) {
	
	int k,j,row=6;
	for ( k = 0; k < row; k++) {
		
		for ( j = row-k; j > 1; j--) {
			
			System.out.print(" ");
		}
		for (j = 0; j <=(2* k); j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}
}