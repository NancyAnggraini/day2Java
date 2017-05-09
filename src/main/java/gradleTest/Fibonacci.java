package gradleTest;

public class Fibonacci {

	static int fibonacci(int n) {
		// compute the nth Fibonacci number and return it.
		if ((n == 0) || (n == 1)) {
			return n;
		}
		else {
			return n = fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
}
