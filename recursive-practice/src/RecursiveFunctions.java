
public class RecursiveFunctions {

	public static void main(String[] args) {
		

	}
	
	public static int factorial(int n) {
		
		if(n==0)
			return 1;
		else {
			return n*factorial(n-1);
		}
		
	}
	
	public static int fibonacci(int n) {
		
		if(n==0) {
			return 0;
		}else if(n==1)
			return 1;
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
	}
	
	public static int arraySummatory(int[] n, int l) {
		if(l==0) {
			return n[0];
		}else {
			return n[l]+arraySummatory(n, l-1);
		}
		
	}

}
