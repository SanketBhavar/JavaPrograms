package pack1;

public class StringOccurrence {
	public static void main(String[] args) {
		String str="Hello World";
		int s1=str.length();
		int s2=str.replace("l", "").length();
		int count=s1-s2;
		System.out.println("No. of Occurrences: "+count);
	}
}
