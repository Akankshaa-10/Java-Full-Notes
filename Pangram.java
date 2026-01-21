package StringPrograms;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println(isPangram(str));
		sc.close();

	}

	public static String isPangram(String str) {
		int count = 0;
		str = str.toLowerCase();
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j])
					ch[j] = '%';
			}
		}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] != '%')
				count++;
		}

		if (count == 26)
			return "it is pangram";
		else
			return "not a pangram";
	}

}
