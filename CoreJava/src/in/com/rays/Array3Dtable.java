package in.com.rays;

public class Array3Dtable {
	public static void main(String[] args) {
		
		int [][][] table = new int [5][5][5];
		
		for (int i = 0; i < table.length; i++) {
			
			for (int j = 1; j < table.length; j++) {
				
				for (int k = 2; k < table.length; k++) {
					
					table[i][j][k] = (i+1) * (j+1) * (k+1);
					
					System.out.print(table[i][j][k] +"\t");
					
					
				}
				System.out.println();
			}
		}
	}

}
