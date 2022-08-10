package pack1;

public class CountHiInString {
	public int countHi(String str) 
	{
		int count = 0;
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
			count++;
		}
		return count;
	}

	//Count the 'hi' in String
	public static void main(String[] args) 
	{
		CountHiInString ch= new CountHiInString();
		int res=ch.countHi("hi hello hi");
		System.out.println(res);
	}
}
