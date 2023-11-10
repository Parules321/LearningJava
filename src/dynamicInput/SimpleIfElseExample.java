package dynamicInput;

public class SimpleIfElseExample {
	
	int age;
	
	void checkIfPersonIsAdult() {
		
		/*Result of comparison is ALWAYS a boolean
		 * Comparison     Result
		 * 100==100       true
		 * 100==101       false
		 * 100!=100       false
		 * 200!=201       true
		 * 200>=100       true
		 * true==false    false
		 */
		boolean areTwoExpressionsEqual = (3+2)==(4+1);//BODMAS
		boolean isAdult = age>18; //Result of comparison is always a boolean and on RHS we are comparing age with 18. Examples of comparison operators are ==,!=,<=, >=
		
		
		if (age>18){System.out.println("Person is adult");}
	
	else {System.out.println("Person is not an adult.");}
	
	
	
	}
	
	
	
	

}
