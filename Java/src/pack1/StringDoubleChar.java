package pack1;

public class StringDoubleChar {
	public String doubleChar(String str) 
	{
		String s1 = "";
		for (int i = 0; i <=str.length()-1;i++) 
		{ 
			s1 = s1 + str.charAt(i) + str.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) 
	{
		StringDoubleChar s= new StringDoubleChar();
		String res=s.doubleChar("Sanket");
		System.out.println(res);
	}
}
