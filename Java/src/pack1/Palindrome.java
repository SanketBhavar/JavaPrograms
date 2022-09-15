package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String s1;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		int m=s1.length();
		char arg[]=new char[m];
		char rev[]= new char[m];
		int i,j;
		for(i=0;i<m;i++)
		{
			arg[i]=s1.charAt(i);
		}
		i=m-1;
		j=0;
		while(i>=0)
		{
			rev[j]=arg[i];
			i--;
			j++;
		}
		boolean status;
		status=Arrays.equals(arg, rev);
		if(status==true) {
			System.out.println(s1+" is a Palindrome String");
		}
		else {
			System.out.println(s1+" is not a Palindrome String");
		}
		sc.close();
	}
}
