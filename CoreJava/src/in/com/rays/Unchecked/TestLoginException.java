package in.com.rays.Unchecked;

public class TestLoginException {
	
	public static void main(String[] args)  {
		
		String name = "admi";
		
		if (name.equals("admin")) {
			System.out.println("user is valid...!!!");
			
		}else {
			
			LoginException l = new LoginException();
			
			System.out.println(l.getMessage());
			
//			agr unchecked wale case mai without trycatch use krna hai to local object banaana is mandatory
			
//			try {
//				throw new LoginException();
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
			
		}
	}

}
