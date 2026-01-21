package StringPrograms;

import java.util.Scanner;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = Character.MIN_VALUE;
				}
			}
			if (ch[i] != Character.MIN_VALUE)
				System.out.println(ch[i] + "-->" + count);
		}
		sc.close();
	}
}
