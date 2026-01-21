package StringPrograms;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String");
		String s2=sc.nextLine();
		if(isAnagram(s1,s2))
			System.out.println("It is anagram");
		else
			System.out.println("not an anagram");
		sc.close();
	}
	
	public static boolean isAnagram(String s1,String s2)
	{
		int[] c1=isCountFrequency(s1);
		int[] c2=isCountFrequency(s2);
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	
	/*
	 * a gentleman==elegantman
	 * hitler woman ==mother in law
	 * A decimal point==Im a dot in place
	 */
	public static int[] isCountFrequency(String str)
	{
		int[] count=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		return count;
	}

}
