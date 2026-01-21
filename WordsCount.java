package StringPrograms;

import java.util.Scanner;

public class WordsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		isWordCount(str);
		sc.close();
	}

	public static void isWordCount(String str) {
		char[] ch = str.toCharArray();
		String big = "";
		for (int i = 0; i < ch.length; i++) {
			String s1 = "";
			while (i <= ch.length - 1 && ch[i] != ' ') {
				s1 = s1 + ch[i];
				i++;
				if (s1.length() > big.length())
					big = s1;
			}
		}
		System.out.println(big);
	}
}
