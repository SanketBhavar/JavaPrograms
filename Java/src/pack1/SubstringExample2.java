package pack1;

public class SubstringExample2 {
	public String firstHalf(String str)
	{
		return str.substring(0,str.length() / 2);
	}
	public static void main(String[] args) 
	{
		SubstringExample2 s= new SubstringExample2();
		String res=s.firstHalf("Sanket");
		System.out.println(res);
	}
}
