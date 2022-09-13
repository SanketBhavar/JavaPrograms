package pack1;

public class OperatorsExample {
	int a=10;
	void display()
    {
	System.out.println(a++);   	//10
        a++;			    	
        ++a;			   	
        System.out.println(++a);	//14	
        System.out.println(a);		//14
        System.out.println(a++);	//14
        a--;
        System.out.println(a);		//14
        System.out.println(--a);	//13
        a++;
        System.out.println(a++);	//14
        System.out.println(a--);	//15
        System.out.println(a);		//14
    }
	public static void main(String []args)
	{
		new OperatorsExample().display();
	}
}
