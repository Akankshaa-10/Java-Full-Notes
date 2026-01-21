package StringPrograms;

import java.util.Scanner;

public class HighestAndLowestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		highestAndLowest(str);
		sc.close();
	}

	public static void highestAndLowest(String str) {
		String[] s = str.split(" ");
		int hcount = 0;
		int lcount = str.length();

		String s1 = "";
		String s2 = "";

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > hcount) {
				hcount = s[i].length();
				s1 = s[i];
			}

			if (s[i].length() < lcount) {
				lcount = s[i].length();
				s2 = s[i];
			}
		}

		System.out.println("highest word is: " + s1);
		System.out.println("lowest word is:  " + s2);
	}
}
