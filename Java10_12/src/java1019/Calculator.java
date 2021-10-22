package java1019;

public class Calculator {
	int sum, sub, mul, div;
	
	 Calculator() {
		
	}
	
	void sum (int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	void  subtraction (int num1, int num2) {
		int sub = num1 - num2;
		System.out.println(sub);
		
	}
	
	int  multiplication (int num1, int num2) {
		int mul = num1 * num2;
		return mul;
		
	}
	
	int division  (int num1, int num2) {
		int div = num1 / num2;
		return div;
	}
	
	
	
	
	
	
	

}
