package pack1;

public class Swapping {
   public static void main(String[] args) {
      int a,b;
      a=1;
      b=2;
      System.out.println("Numbers before swap");
      System.out.println("a:"+a);
      System.out.println("b:"+b);
      int temp;
      temp=a;
      a=b;
      b=temp;
      System.out.println("Numbers after swap");
      System.out.println("a="+a);
      System.out.println("b="+b);
   }
}
