package StringPrograms;

import java.util.Scanner;

public class SubStringsInJavaUsingSplit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		subStrings(str);
		sc.close();
	}
	public static void subStrings(String str)
	{
		String[] s1=str.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			if(isPalindrome(s1[i]))
				System.out.println(s1[i]);
		}
	}
	public static boolean isPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		
		while(i<=j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
