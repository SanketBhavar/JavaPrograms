package pack1;

public class PatternDemo15 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*(5-i+1)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
