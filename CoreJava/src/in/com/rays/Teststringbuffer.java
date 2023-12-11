package in.com.rays;

public class Teststringbuffer {
	// stringbuffer is a mutable//
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Somesh");
		sb.append("Goyanar");

		System.out.println(sb.length());
		 System.out.println(sb.capacity());
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("Goyal"));
		System.out.println(sb.replace(0, 7, "Shubham"));
		System.out.println(sb.reverse());
	}
}
