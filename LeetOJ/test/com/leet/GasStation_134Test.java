package com.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class GasStation_134Test {

	@Test
	public void testCanCompleteCircuit() {
		GasStation_134 test = new GasStation_134();
		assertEquals(0, test.canCompleteCircuit(
				new int[]{2,0,0,0,1,0}, 
				new int[]{1,0,0,0,2,0}
		));
		
		assertEquals(4, test.canCompleteCircuit(
				new int[]{100,200,300,400,500}, 
				new int[]{101,201,301,401,100}
		));
		
		assertEquals(-1, test.canCompleteCircuit(
				new int[]{100,200}, 
				new int[]{101,201}
		));
		
		assertEquals(-1, test.canCompleteCircuit(
				new int[]{100}, 
				new int[]{101}
		));
		
		assertEquals(-1, test.canCompleteCircuit(
				new int[]{}, 
				new int[]{}
		));
		
		assertEquals(2, test.canCompleteCircuit(
				new int[]{5,1,5,3,4,5}, 
				new int[]{3,8,2,4,4,2}
		));
	}

}
