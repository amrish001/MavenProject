package com.digitek.operators;

public class IncrementDecrementOperators {

	public static void main(String[] args){
		computeResult2();
	
	}
    public static int computeResult2(){
	
	int number1= 10;
	int number2 = 2*number1++ + ++number1 + 3*number1-- + number1;
	System.out.println("number2:" + number2);
	return number2;
	
	
    }
	
    }