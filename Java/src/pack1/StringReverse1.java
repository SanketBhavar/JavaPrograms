package pack1;

import java.util.Scanner;

public class StringReverse1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="",rev1="";
		int len=str.length();
		//1st way
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		//2nd way
		char a[]=str.toCharArray();
		int len1=a.length;
		
		for(int i=len1-1;i>=0;i--)
		{
			rev1=rev1+a[i];
		}
		System.out.println(rev1);
		sc.close();
	}
}
