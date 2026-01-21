package StringPrograms;

import java.util.Scanner;

public class CompareTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1 = sc.nextLine();
		System.out.println("Enter the Second String");
		String s2 = sc.nextLine();
		boolean flag = false;

		if (s1.length() != s2.length()) {
			flag = true;
			System.out.println("two Strings are not equal");
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("two strings are equal");
			else
				System.out.println("two strings are not equal");
		}
		sc.close();

	}

}
