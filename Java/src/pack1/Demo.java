package pack1;

class Demo1
{
	int a,b;
	static int count;
	{
		count++;
	}
	Demo1(){
		
	}
	Demo1(int x)
	{
		a=x;
		b=10;
	}
	Demo1(int x, int y)
	{
		a=x;
		b=y;
	}
}

//Count the total no. of objects
class Demo {
	public static void main(String[] args) {
	Demo1 d1,d2,d3,d4,d5;
	d1=new Demo1();
	d2=new Demo1();
	d3=new Demo1();
	d4=new Demo1(10);
	d5=new Demo1(50,60);
	System.out.println("Total no. of objects: "+Demo1.count);
}
}
