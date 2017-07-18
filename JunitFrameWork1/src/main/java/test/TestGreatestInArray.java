package test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculations.FindMaxInArray;

public class TestGreatestInArray {
	
	@Test
	public void testGreatestInArray()
	{
		assertEquals(12 , FindMaxInArray.findMaxInArray(new int[]{1,2,3,4,12}));
		assertEquals(15, FindMaxInArray.findMaxInArray(new int[] {1 ,2 ,4 ,5 ,15 ,11}));
	}

}
