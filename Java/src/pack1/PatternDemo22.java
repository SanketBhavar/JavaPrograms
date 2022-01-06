package pack1;

public class PatternDemo22 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=(i*i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
