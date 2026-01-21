package StringPrograms;

import java.util.Scanner;

public class ConvertInitialCharacterToUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || (ch[i] != ' ' && ch[i - 1] == ' ')) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					s1 = s1 + (char) (str.charAt(i) - 32);
				else
					s1 = s1 + str.charAt(i);
			} else
				s1 = s1 + str.charAt(i);
		}
		System.out.println(s1);
		sc.close();
	}
}
