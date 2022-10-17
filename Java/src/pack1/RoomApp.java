package pack1;

class Room{
	int l,b;
	Room(int x,int y){
		l=x;
		b=y;
	}
	void area() {
		int res;
		res=l*b;
		System.out.println("Area is "+res);
	}
}
class BedRoom extends Room{
	int h;
	BedRoom(int x,int y,int z){
		super(x,y);
		h=z;
	}
	void volume() {
		int res;
		res=l*b*h;
		System.out.println("Volume is "+res);
	}
}

public class RoomApp {
	public static void main(String[] args) {
		BedRoom b1;
		b1 = new BedRoom(10, 20, 30);
		b1.area();
		b1.volume();
	}
}
