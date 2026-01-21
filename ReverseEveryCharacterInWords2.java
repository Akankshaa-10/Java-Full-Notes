package StringPrograms;

import java.util.Scanner;

public class ReverseEveryCharacterInWords2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isReverseWords(str);
		sc.close();
	}
	
	public static void isReverseWords(String str)
	{
		String s1="";
		int f=0;
		int l=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0|| (ch[i]!=' ' && ch[i-1]==' '))
				f=i;
			else if(i==ch.length-1 || ch[i]!=' ' && ch[i+1]==' ')
			{
				l=i;
				while(f<=l)
				{
					s1=s1+ch[l];
					l--;
				}
				if(i!=0)
					s1=s1+' ';
			}
		}
		System.out.println(s1);
	}

}
