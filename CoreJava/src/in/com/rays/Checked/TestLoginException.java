package in.com.rays.Checked;

public class TestLoginException {

	public static void main(String[] args) {
		
		String name = "admi";
		
		if (name.equals("admin")) {
			System.out.println("user is valid");
			
		}else {
				
				try {
					throw new LoginException();
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
					
				}
			}
			
		
	}
}
