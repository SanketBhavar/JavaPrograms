package pack1;

public class ImplicitCastingExample {
	void Implicit()
	{
		byte b=0;
		System.out.println("byte value is "+b);
		short s=b;
		System.out.println("short value is "+s);
		s++;
		int i=s++;
		System.out.println("int value is "+i);
		System.out.println("short value is "+s);
		long l=i;
		System.out.println("long value is "+(--l));
		float f=l;
		System.out.println("float value is "+(f+b));
		double d=(--f);
		System.out.println("short value is "+d);
		show();
		if(!(d==f))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
	public static void main(String[] args)
	{
		ImplicitCastingExample d=new ImplicitCastingExample();
		d.Implicit();
	}
	static void show()
	{
		char c='A';
		int a=++c;
		System.out.println(a);
		ImplicitCastingExample obj=new ImplicitCastingExample();
		String s=obj.meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String S="Implicit casting is done by compiler automatically";
		return S;
	}
}
