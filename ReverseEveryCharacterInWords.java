package StringPrograms;

import java.util.Scanner;

public class ReverseEveryCharacterInWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str = ' ' + str + ' ';
		String s1 = "";
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				for (int j = i - 1; str.charAt(j) != ' '; j--) {
					s1 = s1 + str.charAt(j);
				}
				s1 = s1 + ' ';
			}
		}
		System.out.println(s1);
		sc.close();
	}
}
