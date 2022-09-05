package pack1;

public class HelloProgram {
	public String helloName(String name)
	{
		return "Hello " + name + " !";
	}
	public static void main(String[] args) 
	{
		HelloProgram H= new HelloProgram();
		String res=H.helloName("Sanket");
		System.out.println(res);
	}
}
