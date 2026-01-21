package StringPrograms;

import java.util.Scanner;

public class Pangram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		boolean res = isPangram(str);
		if (res == true)
			System.out.println("It is pangram");
		else
			System.out.println("not a pangram");
		sc.close();

	}
	/*
	 * The five boxing wizards jump quickly:
	 * The qucik brown fox jumps over a lazy dog
	 * abcdefghijklmnopqrstuvwxyz
	 */

	public static boolean isPangram(String str) {
		if (str.length() < 26)
			return false;

		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] == 0)
				return false;
		}
		return true;
	}

}
