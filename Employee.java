package test;

public class Employee {
	
	int id;
	String name;
	int salary;
	String company;
	
	void insertRecord(int d, String n, int s, String c) {
		id = d;
		name = n;
		salary = s;
		company = c;
	}
	
	
	void displayContent() {
		System.out.println(id + " " + name + " " + salary + " " + company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.insertRecord(10, "Praveen", 40000, "Cisco");
		e2.insertRecord(11, "Sundar", 50000, "Google");
		
		
		e1.displayContent();
		e2.displayContent();
		

	}

}
