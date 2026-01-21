package StringPrograms;

import java.util.Scanner;

public class CountOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') || i == str.length() - 1)
				count++;
		}
		System.out.println("No of words in String: " + count);
		sc.close();
	}
}
