package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeTest {
	@Test
	public void evaluatesExpression()
	{
		Prime p = new Prime();
		boolean b = p.prime1(7);
		assertEquals(true,b);
	
	}

}
