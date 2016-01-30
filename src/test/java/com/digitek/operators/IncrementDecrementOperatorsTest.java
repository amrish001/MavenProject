package com.digitek.operators;

import org.junit.Assert;
import org.junit.Test;

public class IncrementDecrementOperatorsTest {

	
	
	@Test
	public void computeResultest(){
		
		 IncrementDecrementOperators co = new IncrementDecrementOperators();
		int actualResult =  co.computeResult2();
		Assert.assertEquals(68, actualResult);
 
	}
	
	
	
	
}
