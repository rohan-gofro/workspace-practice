package test;

import org.junit.Test;
import static org.junit.Assert.*;  
import calculations.GreatestNumber;


public class TestGreatestNumber {
	
	@Test
	public void testMax()
	{
		assertEquals(5, GreatestNumber.findMax(3, 5));
		assertEquals(9, GreatestNumber.findMax(9, 5));
	}
	
	

}
