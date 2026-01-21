package StringPrograms;

import java.util.Scanner;

public class ConvertInitialCharacterToUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String s2 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if (i == 0 || str.charAt(i - 1) == ' ' && str.charAt(i) != ' ')
					s2 = s2 + (char) (str.charAt(i) - 32);
				else
					s2 = s2 + str.charAt(i);
			} else
				s2 = s2 + str.charAt(i);
		}
		System.out.println(s2);
		sc.close();
	}
}
