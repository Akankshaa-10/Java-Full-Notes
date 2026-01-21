package StringPrograms;

import java.util.Scanner;

public class CountOfAllCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int uc = 0, lc = 0, sp = 0, digits = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				uc++;
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				lc++;
			else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				digits++;
			else
				sp++;
		}
		System.out.println("uppercase: " + uc + " " + "\t lowercase " + lc + "" + "\t  digits: " + digits + ""
				+ "\t specialcharacter: " + sp);
		sc.close();
	}

}
