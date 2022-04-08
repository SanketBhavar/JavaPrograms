package pack1;

public class StringReverse {
	public static void main(String[] args) {
		String str="Welcome To Java Programming";
		String str1[]=str.split(" ");
		for(String temp:str1) {
			System.out.println(temp);
		}
		for(int i=0;i<4;i++) {
			char[] s1=str1[i].toCharArray();
			for(int j=s1.length-1;j>=0;j--) {
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
	}
}
