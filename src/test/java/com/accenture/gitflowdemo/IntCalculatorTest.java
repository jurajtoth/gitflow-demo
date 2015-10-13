package com.accenture.gitflowdemo;

import org.junit.Assert;
import org.junit.Test;

public class IntCalculatorTest {
	
	@Test
	public void testSum() {
		IntCalculator c = new IntCalculator();
		Assert.assertEquals(c.add(3, 4), 7);
	}
	
	@Test
	public void testSubtract() {
		IntCalculator c = new IntCalculator();
		Assert.assertEquals(c.subtract(3, 7), -4);
	}

}
