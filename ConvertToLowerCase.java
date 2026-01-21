package StringPrograms;

import java.util.Scanner;

public class ConvertToLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter teh String");
		String s1 = "";
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				s1 = s1 + ((char) (str.charAt(i) + 32));
			else
				s1 = s1 + str.charAt(i);
		}
		System.out.println(s1);
		sc.close();
	}
}
