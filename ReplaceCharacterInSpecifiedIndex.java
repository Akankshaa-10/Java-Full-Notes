package StringPrograms;

import java.util.Scanner;

public class ReplaceCharacterInSpecifiedIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the index where to be replaced");
		int index = sc.nextInt();
		System.out.println(isReplace2(str, ch, index));

		sc.close();
	}

	//first way
	public static void isReplace1(String str, char ch, int index) {
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == index)
				s1 = s1 + ch;
			else if (i < index)
				s1 = s1 + str.charAt(i);
			else if (i > index)
				s1 = s1 + str.charAt(i);
		}
		System.out.println(s1);
	}
	
	//second way
		public static String isReplace2(String str,char ch1,int index)
		{
			char[] ch=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(i==index)
					ch[i]=ch1;
			}
			return new String(ch);
		}
}
