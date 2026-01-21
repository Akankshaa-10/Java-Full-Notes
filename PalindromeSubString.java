package StringPrograms;

import java.util.Scanner;

public class PalindromeSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s1 = "";
			while (i <= ch.length - 1 && ch[i] != ' ') {
				s1 = s1 + ch[i];
				i++;
			}
			if (isPanlindrome(s1))
				System.out.println(s1);
		}
		sc.close();

	}

	public static boolean isPanlindrome(String s1) {
		char[] ch = s1.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (ch[i] != ch[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}
