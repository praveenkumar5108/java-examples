package test;

public class Account {
	
	int acc_num;
	String name;
	float amount;
	
	void insertR(int ac, String n, float amt) {
		
		acc_num = ac;
		name = n;
		amount = amt;
		
	}
	
	void deposite(float amt) {
		amount = amount + amt;
		System.out.println(amount + " " + "deposited");
	}
	
	void withdraw(float amt) {
		if(amount < amt) {
			System.out.println("insuficient balance");
		}else {
			amount = amount - amt;
			System.out.println("amount withdrawn" + " " + amount);
		}
	}
	
	void checkbalance() { 
		System.out.println("Balance is" + " " + amount);
	}
	
	void display() {
		System.out.println(acc_num + " " + name + " " + amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		
		a1.insertR(3232441, "Praveen Kumar", 32635);
		a1.display();
		a1.deposite(40423);
		a1.checkbalance();
		a1.withdraw(32321);
		a1.checkbalance();
		
		

	}

}
