package in.com.rays;

public class Teststringarray {

	public static void main(String[] args) {

		String[] names = { "kaushal", "satyam", "shubham" };
		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < names.length; i++) {

				for (int j = 0; j < names[i].length(); j++) {

					if (names[i].charAt(j) == ch) {

						count++;

					}

				}

				
				}
			if (count > 0) {

				System.out.println(ch + " = " + count);
			}

			count = 0;
		}

	}
}
