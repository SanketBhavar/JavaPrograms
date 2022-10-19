package pack1;

import java.util.Scanner;

abstract class Shape{
	float area;
	abstract void input();                        
	abstract void calArea();                           //Abstract method       Abstract+Concrete = Impure Abstract Class 
	void display() {                                   //concrete method
		System.out.println("Area is "+area);
	}
}

class Square extends Shape{
	float l;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Length");
		l=sc.nextFloat();
		//sc.close();
	}
	void calArea() {
		area=l*l;
	}
}

class Rectangle extends Shape{
	float l,b;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Length");
		l=sc.nextFloat();
		System.out.println("Enter a Breadth");
		b=sc.nextFloat();
		//sc.close();
	}
	void calArea() {
		area=l*b;
	}
}

class Circle extends Shape{
	float r;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius");
		r=sc.nextFloat();
		//sc.close();
	}
	void calArea() {
		area=3.14f*r*r;
	}
}

class Geometry{
	void allowShape(Shape ref) {
		ref.input();
		ref.calArea();
		ref.display();
	}
}

public class ShapeApp {
	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Geometry g=new Geometry();
		
		g.allowShape(s);
		System.out.println();
		g.allowShape(r);
		System.out.println();
		g.allowShape(c);
	}
}
