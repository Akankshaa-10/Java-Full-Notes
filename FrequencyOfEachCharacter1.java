package StringPrograms;

import java.util.Scanner;

public class FrequencyOfEachCharacter1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		int[] count = new int[128];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z')
				count[ch]++;

		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println((char) i + "---->" + count[i]);
			}
		}
		
		sc.close();
	}

}
