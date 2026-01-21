package StringPrograms;

import java.util.Scanner;

public class ReplaceCharcters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter which character to be replaced");
		char c = sc.next().charAt(0);
		System.out.println("Enter the character to be replaced ");
		char re = sc.next().charAt(0);
		System.out.println(isReplace(str, c, re));
		sc.close();
	}

	public static String isReplace(String str, char c, char re) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c)
				ch[i] = re;
		}
		return new String(ch);
	}

}
