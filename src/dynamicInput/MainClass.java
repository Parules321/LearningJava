package dynamicInput;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*CalculateFuelInjection calculateFuelInjection = new CalculateFuelInjection();
		
		//initialize variables means assigning values to variables
		calculateFuelInjection.xthrottle = 256;
		//calculateFuelInjection.yfuel 
		//calculateFuelInjection.calculateFuelInjection();
		calculateFuelInjection.calculateFuelInjection ();*/
		
		
		//have created the copy to prove a very important point that the result of a comparison is always a boolean. 
		//so any condition in if , else if is always a boolean - true or false.
		
		
		CopyOfCalculateFuelInjection copyCalculateFuelInjection = new CopyOfCalculateFuelInjection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of xthrottle in console.");
		
		copyCalculateFuelInjection.xthrottle=sc.nextInt();//for reading int it is nextint, for reading string it is only next
		
		copyCalculateFuelInjection.calculateFuelInjection();
		
		
	}

}
 