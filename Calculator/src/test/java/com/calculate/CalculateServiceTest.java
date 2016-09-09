package com.calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateServiceTest {

	CalculatorService cal = new CalculatorService();
	
	@Test
	public void addTest1() {
		int a = 5; 
		int b = 6;
		assertEquals(11, cal.add(a, b) );		
	}
	
	@Test
	public void addTest2() {
		int a = 4;
		int b = 8;
		assertNotEquals(15, cal.add(a, b));
	}
	
	@Test
	public void addTest3() {
		int a = 12;
		int b = 15;
		assertEquals(27, cal.add(a, b));
	}
	
	@Test
	public void subtractTest1() {
		int a = 10;
		int b = 6;
		assertEquals(4, cal.subtract(a, b));
	}
	
	@Test
	public void subtractTest2() {
		int a = 10;
		int b = 15;
		assertEquals(-5, cal.subtract(a, b));
	}
		
	@Test
	public void subtractTest3() {
		int a = 8;
		int b = 17;
		assertNotEquals(12, cal.subtract(a, b));
	}
	
	@Test
	public void multiplyTest1() {
		int a = 5;
		int b = 5;
		assertEquals(25, cal.multiply(a, b));
	}
	
	@Test
	public void multiplyTest2() {
		int a = -10;
		int b = -5;
		assertEquals(50, cal.multiply(a, b));
	}
	
	@Test
	public void multiplyTest3() {
		int a = -10;
		int b = -5;
		assertNotEquals(-50, cal.multiply(a, b));
	}
	
	@Test
	public void divideTest1() {
		int a = -10;
		int b = -5;
		assertEquals(2, cal.divide(a, b));
	}
	
	@Test(expected = Exception.class)
	public void divideTest2() {
		int a = 5;
		int b = 0;
		
		cal.divide(a, b);
	}
	
	@Test(expected = Exception.class)
	public void divideTest3() {
		int a = 0;
		int b = 0;
		
		cal.divide(a, b);
	}
	
}
