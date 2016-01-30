package com.digitek.fundamental;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		addition(2,3);
		int result = addition2(4,7,8);
		addition (result,5);
		subtraction(9,3);
		int result1 = subtraction2(5,2,9);
		subtraction(result1,12);
		
		
	}
	
	public static int addition(int no1, int no2) { 
	 
		
		int sum = no1+no2;
		return sum;
	}
	
	
	public static int addition2(int no1, int no2, int no3){

		
			int sum = no1+no2+no3;
			System.out.println("sum;"+ sum);
			return sum;
			
	}
	





	public static int subtraction(int no1, int no2){
		
		int sum = no1-no2;
		return sum;                                                                                                                                                           
		
		
	}
		
		public static int subtraction2(int no1, int no2, int no3){	
		
			
			int sum = no1-no2-no3;
			System.out.println("sum;"+ sum);
			return sum;
			
		}

			
			
			

}