package test;

public class CountingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String str = "BeginnersBook"; 
        
        //initialized the counter to 0
        int counter = 0;  
        
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'B') { 
            	//increasing the counter value at each occurrence of 'B'
                counter++;  
            }  
        }  

	}

}
