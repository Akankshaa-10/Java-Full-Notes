package StringPrograms;

import java.util.Scanner;

public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = Character.MIN_VALUE;
					count++;
				}
			}
			if (ch[i] != Character.MIN_VALUE && count > 0)
				System.out.println(ch[i]);
		}
		sc.close();
	}
}
