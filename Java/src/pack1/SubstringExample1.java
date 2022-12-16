package pack1;

public class SubstringExample1 {
	public String extraEnd(String str)
	{
		String s1=str.substring(str.length()-2, str.length());
		return s1+s1+s1;
	}
	public static void main(String[] args) 
	{
		SubstringExample1 s= new SubstringExample1();
		String res=s.extraEnd("Hi");
		System.out.println(res);
	}	
}
