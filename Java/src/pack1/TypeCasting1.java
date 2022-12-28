package pack1;

public class TypeCasting1 {
	void meth1()
	{
		System.out.println("*****Implicit Typecasting*****");
		byte b=10;
		int i=b;
		System.out.println("byte value===>"+b);
		System.out.println("integer value===>"+i);
		
		char c='A';
		int x=c;
		System.out.println("char value===>"+c);
		System.out.println("integer value===>"+x);
	}
	void meth2()
	{
		System.out.println("*****Explicit Typecasting*****");
		int i=500;
		byte b=(byte)i;
		System.out.println("int value===>"+i);
		System.out.println("byte value===>"+b);
		
		float f=10.78f;
		byte x=(byte)f;
		System.out.println("float value===>"+f);
		System.out.println("byte value===>"+x);
	}
	public static void main(String[] args) 
	{
		TypeCasting1 aobj=new TypeCasting1();
		aobj.meth1();
		System.out.println("---------------------------------------------");
		TypeCasting1 aobj1=new TypeCasting1();
		aobj1.meth2();
	}

