package pack1;

interface Connection{
	void connect();
	void query();
	void close();
}

class Oracle implements Connection{
	public void connect() {
		System.out.println("Connecting to Oracle DataBase....");
	}
	public void query() {
		System.out.println("Query OracleDB");
	}
	public void close() {
		System.out.println("Closing Oracle DataBase");
	}
}

class SyBase implements Connection{
	public void connect() {
		System.out.println("Connecting to SyBase DataBase....");
	}
	public void query() {
		System.out.println("Query SyBaseDB");
	}
	public void close() {
		System.out.println("Closing SyBase DataBase");
	}
}

class Informix implements Connection{
	public void connect() {
		System.out.println("Connecting to Informix DataBase....");
	}
	public void query() {
		System.out.println("Query InformixDB");
	}
	public void close() {
		System.out.println("Closing Informix DataBase");
	}
}

class ConnectionDB{
	void allowConnection(Connection ref) {
		ref.connect();
		ref.query();
		ref.close();
	}
}

public class DataBaseApp {
	public static void main(String[] args) {
		Oracle o=new Oracle();
		SyBase s=new SyBase();
		Informix i=new Informix();
		ConnectionDB c=new ConnectionDB();
		c.allowConnection(o);
		c.allowConnection(s);
		c.allowConnection(i);
	}
}
