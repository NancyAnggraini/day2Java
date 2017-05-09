package gradleTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFibonnaci1() {
		assertEquals(0, Fibonacci.fibonacci(0));
	}
	
	@Test
	public void testFibonnaci2() {
		assertEquals(1, Fibonacci.fibonacci(1));
	}
	
	@Test
	public void testFibonnaci3() {
		assertEquals(144, Fibonacci.fibonacci(12));
	}
	
//	@Test
//	public void testFibonnaci4() {
//		assertEquals(-8, Fibonacci.fibonacci(-6));
//	}

}
