package StringPrograms;

import java.util.Scanner;

public class ChangeWordsPositionInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		String s2 = "";

		String[] ar = str.split(" ");

		for (int i = ar.length - 1; i >= 0; i--) {
			s2 = s2 + ar[i] + " ";
		}
		System.out.println(s2);
		sc.close();
	}
}
