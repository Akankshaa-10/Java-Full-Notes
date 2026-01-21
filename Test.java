package StringPrograms;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		char[] ch=str.toCharArray();
		String s1="";
		int f=0;
		int l=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0|| (ch[i]!=' ' && ch[i-1]==' '))
				f=i;
			else if(i==ch.length-1 || (ch[i]!=' ' && ch[i+1]==' '))
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
		sc.close();
	}

}
