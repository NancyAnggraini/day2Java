package gradleTest;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FactorialTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testFactorialRecursive1() {
		assertEquals(1, Factorial.factorialRecursive(0));
	}
	
	@Test
	public void testFactorialRecursive2() {
		assertEquals(120, Factorial.factorialRecursive(5));
	}
	
	@Test
	public void testFactorialRecursive3() {
		assertEquals(2432902008176640000l, Factorial.factorialRecursive(20));
	}
	
	@Test
	public void testFactorialRecursive4() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Only positive values are permitted");
		Factorial.factorialRecursive(-1);
	}

	@Test
	public void testFactorialIteration1() {
		assertEquals(1, Factorial.factorialIteration(0));
	}
	
	@Test
	public void testFactorialIteration2() {
		assertEquals(120, Factorial.factorialIteration(5));
	}
	
	
}


