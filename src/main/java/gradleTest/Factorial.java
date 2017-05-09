package gradleTest;

public class Factorial {

	static long factorialRecursive(long n) {
		
		if (n < 0) {
			throw new IllegalArgumentException("Only positive values are permitted");
		}
		
		n = n == 0 ? 1 : n*factorialRecursive(n-1);  
		return n;
		
//		before refactoring:
//		if (n == 0) {
//			n = 1;
//		}
//		else {
//			n *= factorialRecursive(n-1);
//		}
//		return n;
		
	}
	
	static int factorialIteration(int n) {
		
		if (n < 0) {
			throw new IllegalArgumentException("Only positive values are permitted");
		}
		
		if (n == 0) {
			n = 1;
		}
		else {
			for (int i = n-1; i > 0; i--) {
				n = n * i;
			}
		}
		return n;
		
	}
	
}
