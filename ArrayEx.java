package test;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {12,23,11,34};
		
		String india = "Clean India Green India";
		String str1 = "";
		
		for(int i = 0; i<=nums.length-1; i++) {
			System.out.println(nums[i]);
		}
		
		// reverse the array elements
		
		for(int i = nums.length-1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
		
		// all letters
		for(int j = 0; j<=india.length()-1;j++) {
			System.out.println(india.charAt(j));
		}
		
		//reverse char
		for(int i = india.length()-1; i >= 0; i--) {
			str1 += india.charAt(i);
			System.out.println(str1);
			
		}
		
		String[] words = india.trim().split("");
		System.out.println(words.length);

	}

}
