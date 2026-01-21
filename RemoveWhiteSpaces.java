package StringPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String s1 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
			} else
				s1 = s1 + str.charAt(i);
		}
		System.out.println(s1);
		sc.close();
	}
}
