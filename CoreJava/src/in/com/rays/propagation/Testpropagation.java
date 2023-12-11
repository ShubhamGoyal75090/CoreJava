package in.com.rays.propagation;

public class Testpropagation {
	
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (MistakeException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
		}
	public static void dad() throws MistakeException {
		mom();
	}
	public static void mom() throws MistakeException {
		son();
	}
	public static void son() throws MistakeException {
		
		throw new MistakeException();
		
	}
	
		
	}

