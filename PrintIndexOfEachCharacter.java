package StringPrograms;

import java.util.Scanner;

public class PrintIndexOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+"-->"+i);
		}
		sc.close();
	}

}
