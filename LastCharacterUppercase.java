package StringPrograms;

import java.util.Scanner;

public class LastCharacterUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String s1 = "";

		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length - 1 || (ch[i] != ' ' && ch[i + 1] == ' ')) {
				if (ch[i] >= 'a' && ch[i] <= 'z')
					s1 = s1 + (char) (ch[i] - 32);
				else
					s1 = s1 + ch[i];
			} else
				s1 = s1 + ch[i];
		}
		System.out.println(s1);
		sc.close();
	}
}
