package pack1;

class Student{
	String name;
	int age;
	float height;
	
	void setData(String name, int age, float height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
}
public class StudentApp {
	public static void main(String[] args) {
		Student s1;
		s1=new Student();
		s1.setData("rama", 22, 5.8f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		
		Student s2;
		s2=new Student();
		s2.setData("abhi", 19, 5.5f);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
	}
}
