package in.com.rays.Exception;

public class TestMultiplecatch {
	
	public static void main(String[] args) {
		
		try {
			
			String name = "abc";
			System.out.println(name.length());
			System.out.println(name.charAt(5));
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("division = " + c);
			
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch (NullPointerException e) {
			System.out.println("Nullpointer Exception");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception");
		}catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("after try catch");
	}

}
