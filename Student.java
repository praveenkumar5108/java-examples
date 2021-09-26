package test;

public class Student {
	
	int rollnum;
	String name;
	
	void insertRecord(int r, String n) {
		rollnum = r;
		name = n;
	}
	
	void displayInformation() {
		System.out.println(rollnum + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.insertRecord(101, "Praveen");
		s2.insertRecord(102, "Kumar");
		
		
		s1.displayInformation();
		s2.displayInformation();

	}

}
