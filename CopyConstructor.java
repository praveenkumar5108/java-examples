package test;

public class CopyConstructor {
	
	int id;
	String name;
	
	CopyConstructor(int d, String n){
		id = d;
		name =n;
	}
	
	CopyConstructor(CopyConstructor s){
		id = s.id;
		name = s.name;
		
	}
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructor c = new CopyConstructor(111,"praveen");
		CopyConstructor c1 = new CopyConstructor(c);
		
		c.display();
		c1.display();
		
		

	}

}
