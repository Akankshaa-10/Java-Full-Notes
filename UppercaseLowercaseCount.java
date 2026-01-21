package StringPrograms;

import java.util.Scanner;

public class UppercaseLowercaseCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int uc = 0;
		int lc = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 'A' && str.charAt(i) <= 'Z') {
				uc++;
			} else if (str.charAt(i) > 'A' && str.charAt(i) < 'z') {
				lc++;
			}
		}
		System.out.println("count of Uppercase characters: " + uc);
		System.out.println("count of Lower characters: " + lc);
		sc.close();
	}
}
