package pack1;

class Heart1{
    Heart1(){
        System.out.println("Heart is created");
    }
    void getHeart(){
    	System.out.println("Heart is pumping a Blood");
    }
}

class Brain1{
    Brain1(){
        System.out.println("Brain is created");
    }
    void getBrain(){
    	System.out.println("Brain is still working");
    }
}

class Knowledge{
    Knowledge(){
        System.out.println("Knowledge is created");
    }
    void getKnowledge(){
    	System.out.println("Employee working on Knowledge");
    }
}

class Car1{
	Car1(){
		System.out.println("Car created");
    }
    void getCar(){
        System.out.println("car can be used for driving");
    }
}

class Property{
	Property(){
		System.out.println("Property created");
        }
	void getProperty(){
		System.out.println("Person has property");
	}
}

class Person2{
        Heart1 h = new Heart1();
        Brain1 b = new Brain1();
        Person2(){
            System.out.println("Person created with Heart and Brain");
        }
        void hasA(Car1 c){
            System.out.println("Person purchesed car");
        }
        void hasA(Property s){
        System.out.println("Person purchesed property");
    }
}

public class PersonApplication2{
    public static void main(String[]args){
        Person2 p;
        p = new Person2();
        Car1 c;
        c = new Car1();
        Property s;
        s = new Property();
        p.hasA(c);
        p.hasA(s);
        p.h.getHeart();
        p.b.getBrain();
        c.getCar();
        s.getProperty();
    }
}
