import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {

	@Test
	void testFactorial() {
		
		assertTrue("The method doesn't work", RecursiveFunctions.factorial(5) == 120);
		assertTrue("The method doesn't work", RecursiveFunctions.factorial(10) == 3628800);
		assertTrue("The method doesn't work", RecursiveFunctions.factorial(3) == 6);
		
	}
	
	@Test
	void testFibonacci() {
		
		assertTrue("The method doesn't work", RecursiveFunctions.fibonacci(2) == 1);
		assertTrue("The method doesn't work", RecursiveFunctions.fibonacci(4) == 3);
		assertTrue("The method doesn't work", RecursiveFunctions.fibonacci(7) == 13);
		
	}
	
	@Test
	void testArraySummatory() {
		
		int[] n = {4,5,6,7,8,9};
		int l=n.length-1;
		
		assertTrue("The method doesn't work", RecursiveFunctions.arraySummatory(n,l) == 39);
		
	}

}
