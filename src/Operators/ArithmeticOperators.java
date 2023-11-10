package Operators;

public class ArithmeticOperators {
	int num1, num2;

	void add() {
		int sum = num1 + num2;
		System.out.println("sum is" + sum);
	}

	void subtract() {
		int difference = num1 - num2;
		System.out.println("Difference is" + difference);
	}

	void multiply() {
		int product = num1 * num2;
		System.out.println("Product is" + product);
	}

	void divide() {
		int quotient = num1 / num2;
		System.out.println("Quotient is" + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder is" + remainder);
	} // this will get 1 as result as int data type can only take integer/ whole
		// number and not decimal number as value and quotient is 1.
//For remainder, we have a different arithmetic operation dentoted by % sign)

	void division() {double num1 = 3.0, num2 = 2.0; double quotient = num1/num2;
	System.out.println("Quotient with decimal value:"+ quotient);
	// if we want to get the exact value in division which may be in decimal, 
	//contd./- we have to give the decimal values in both input and output so instead of int we use double for num1, num2 and quotient.
		
	}
	
	
	
	

}
