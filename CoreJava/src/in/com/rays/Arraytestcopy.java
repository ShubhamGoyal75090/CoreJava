package in.com.rays;

public class Arraytestcopy {

	public static void main(String[] args) {

	char[] copyfrom = { 'a', 'b', 'c', 'd', 'e', 'f' };

		char[] copyto = new char[10];
		System.arraycopy(copyfrom, 0, copyto, 2, 6);
		System.out.println(new String(copyto));
	}

		
}