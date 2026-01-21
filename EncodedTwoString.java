package StringPrograms;

import java.util.Scanner;

public class EncodedTwoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(code(s1, s2));
		sc.close();
	}

	public static String code(String input1, String input2) {
		String[] words = { input1, input2 };
		String[][] parts = new String[2][3];
		for (int i = 0; i < 2; i++) {
			int len = words[i].length();
			if (len % 3 == 0 || len % 3 == 1) {
				parts[i][0] = words[i].substring(0, len / 3);
				parts[i][1] = words[i].substring(len / 3, len - len / 3);
				parts[i][2] = words[i].substring(len - len / 3);
			} else {
				parts[i][0] = words[i].substring(0, len / 3 + 1);
				parts[i][1] = words[i].substring(len / 3 + 1, len - len / 3 - 1);
				parts[i][2] = words[i].substring(len - len / 3 - 1);
			}
		}
		return (parts[1][2] + parts[0][1] + parts[1][1] + parts[0][0]);
	}

}
