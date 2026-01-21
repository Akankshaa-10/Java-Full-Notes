package StringPrograms;

import java.util.Scanner;

public class ZigZagString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String");
		String s2 = sc.nextLine();

		System.out.println(isZigZag(s1, s2));
		sc.close();
	}

	public static String isZigZag(String s1,String s2)
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		char[] ch3=new char[ch1.length+ch2.length];
		
		int i=0,j=0,k=0;
		while(k<ch3.length)
		{
			if(i<ch1.length)
				ch3[k++]=ch1[i++];
			if(j<ch2.length)
				ch3[k++]=ch2[j++];
		}
		return new String(ch3);
	}
}
