package pack1;

public class Circle1{
    public static float radius = 10.0f;
    public static void main(String[] a){
        System.out.println(area(radius));
    }
public static float area(float radius){     //Calculating the Area of Circle
        return 3.141f * radius * radius;
    }
}
