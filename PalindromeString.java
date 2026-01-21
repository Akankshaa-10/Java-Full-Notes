package StringPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int i = 0;
		int j = str.length() - 1;
		boolean flag = true;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			} else {
				i++;
				j--;
			}
		}
		if (flag == true)
			System.out.println("it is a palindrome String");
		else
			System.out.println("it is not a palindrome String");
		sc.close();
	}
}
