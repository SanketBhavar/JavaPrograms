package pack1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {
		String s1;
		Scanner sc = new Scanner(System.in);
		s1=sc.next();
		StringTokenizer stk;
		stk=new StringTokenizer(s1,",");
		while(stk.hasMoreTokens())
		{
			String token=stk.nextToken();
			System.out.println(token);
		}
		sc.close();
	}
}
