package pack1;

import java.util.Scanner;

class Person{
	String name;
	int age;
}
class PersonApp {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		Person p[];
		p=new Person[4];
		p[0]=new Person();
		p[1]=new Person();
		p[2]=new Person();
		p[3]=new Person();
		
		for(i=0;i<=3;i++)
		{
			System.out.println("Enter the name");
			p[i].name = sc.next();
			System.out.println("Enter the age");
			p[i].age = sc.nextInt();
		}
		for(i=0;i<=3;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
		}
		sc.close();
	}
}
