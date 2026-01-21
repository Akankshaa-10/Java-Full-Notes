package StringPrograms;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int vc = 0, cc = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
						|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
					vc++;
				else
					cc++;
			}
		}
		System.out.println("count of vowels: " + vc);
		System.out.println("count of consonants: " + cc);
		sc.close();
	}
}
