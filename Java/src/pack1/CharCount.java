package pack1;

public class CharCount {
	public static void main(String[] args) throws IOException {
		String s1;
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		s1=scan.next();
		System.out.println("Enter a Character");
		ch=(char)System.in.read();
		int m,i;
		m=s1.length();
		int count=0;
		for(i=0;i<m;i++)
		{
			if(s1.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
