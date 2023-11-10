package dynamicInput;

public class CalculateFuelInjection {
	int xthrottle, yfuel;

	void calculateFuelInjection() {
		boolean isXLessThan127 = xthrottle <= 127;

		// if(conditon){code that will be executed when the result of condition is true)

		if (xthrottle>0 && xthrottle <= 127) {
			yfuel = xthrottle * 2; System.out.println("yfuel value is: " + yfuel);
		}

		/* if(xthrottle>=128)

		else {
			yfuel = xthrottle + 127;
		}*/
		
		else if (xthrottle>=128 && xthrottle<=255) {yfuel= xthrottle+127; System.out.println("yfuel value is: " + yfuel);} //use else if for adding another condition after if, use else otherwise

		else {System.out.println("xthrottle should be between 1 to 255.");}
		
		
		

	}}

	/*void anotherMethodToCalculateFuelInjection() {
		boolean isXLessThan127 = xthrottle <= 127;
		if (isXLessThan127 == true)

		{
			yfuel = xthrottle * 2;
		}

		else {
			yfuel = xthrottle + 127;
		}

		System.out.println("yfuel value is: " + yfuel);

	}*/
	


