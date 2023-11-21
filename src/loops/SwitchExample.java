package loops;

import java.util.Scanner;

public class SwitchExample {

	double num1, num2, result;
	//String operation = "", one can also initialize string here but make sure /n
	//to give empty value as "". don't keep it to default value null as keeping it null /n
	//may create issue in running the program at times.
	

	Scanner sc = new Scanner(System.in);

	void performOperation() {
		System.out.println("Please type add for addition and type subtract for substraction");

		String operation = sc.next();

		switch (operation) {

		case "add":
			result = num1 + num2;
			break;

		case "subtract":
			result = num1 - num2;
			break;
		default:
			System.out.println("Unsupported Operation");
			break;

		}
		
		System.out.println("Result is: " + result);

	}
	
	
	
	void performOperationUsingInt() {System.out.println("Please type 1 for additon and 2 for subtraction.");
	
	int operation = sc.nextInt();
	
	switch (operation) {
	
	case 1:result=num1+num2; break;
	
	case 2:result=num1-num2; break;
	
	default:System.out.println("Unsupported Operation");
	
	}
	
	System.out.println("Result is: " + result);
	
	
	
	
	}
	
	
	}


