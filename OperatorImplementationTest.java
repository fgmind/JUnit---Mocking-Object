package com.IT7320.assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class OperatorImplementationTest {

	OperatorImplementation test;
	int x,y;
	
	@Before
	public void setUp() throws Exception {
		x = 10;
		y = 5;	
		
		IOperator mock = mock(IOperator.class);
		when(mock.add(x, y)).thenReturn(x+y);
		when(mock.subtract(x, y)).thenReturn(x-y);
		when(mock.multiply(x, y)).thenReturn(x*y);
		when(mock.divide(x, y)).thenReturn(x/y);
		




		test = new OperatorImplementation();		
		test.setResult(mock);
		
			
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void testAdd() {
		assertSame(15, test.add(x, y));
	}
	
	@Test
	public void testSubtract(){
		assertSame(5, test.subtract(x, y));
	}
	
	@Test
	public void testMultiply(){
		assertSame(50, test.multiply(x, y));
	}
	
	@Test
	public void testDivide(){
		assertSame(2, test.divide(x, y));
	}
}
