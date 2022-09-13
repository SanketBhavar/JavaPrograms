package pack1;

public class OperatorsExample {
	int a=10;
	void display()
    {
		System.out.println(a++);
        a++;
        ++a;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        a--;
        System.out.println(a);
        System.out.println(--a);
        a++;
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a);
    }
	public static void main(String []args)
	{
		new OperatorsExample().display();
	}
}
