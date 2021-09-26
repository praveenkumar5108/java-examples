package test;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Unary Operator
		int a = 10;
		System.out.println(a++);//10
		System.out.println(++a);//12
		System.out.println(a--);//12
		System.out.println(--a);//10
		
		int a1 = 20;
		int b1 = -20;
		
		boolean c1 = true;
		boolean d1 = false;
		
		System.out.println(~a1);//-20 (minus of total positive value which starts from 0)  
		System.out.println(~b1); //19 (positive of total minus, positive starts from 0)
		
		System.out.println(!c1);//false (opposite of boolean value) 
		System.out.println(!d1);//true
		
		
		
		//LeftShift Operator
		
		System.out.println(10<<2);//10*2^2=10*4=40 
		System.out.println(9<<2); //9*2^2=9*4=36
		
		//RightShift Operator
		
		System.out.println(10>>2);// 10/2^2=10/4=2
		System.out.println(9>>2); // 9/2^2 = 9/4 =2
		
		
		//Ternary Operator
		
		int a2 = 2;
		int a3 = 3;
		
		int min = (a2>a3)?a2:a3;
		
		System.out.println(min);
		
		
		
		for(int i = 0; i <= 2; i++) {
			for(int j = i; j <=5; j++) {
				if(j ==4) {
					continue;
				}
				System.out.println(j);
			}
		}
		
	}

}
