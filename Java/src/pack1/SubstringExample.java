package pack1;

public class SubstringExample {
	public String makeOutWord(String out, String word)
	{
		return out.substring(0,2) + word + out.substring(2,4);
	}
	public static void main(String[] args) 
	{
		SubstringExample s= new SubstringExample();
		String res=s.makeOutWord("<<>>","Java Programming");
		System.out.println(res);
	}
}
