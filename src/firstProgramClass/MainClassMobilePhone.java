package firstProgramClass;

public class MainClassMobilePhone {

	
	//Main Method - Program execution starts from main method. It is the starting point of Java.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object of that class
		//MobilePhone mobilePhoneObject = new MobilePhone();
		//Object Creation
		//Syntax = ClassName objectName = new ClassName();
		MobilePhone samsungPhone = new MobilePhone();
		
		MobilePhone applePhone = new MobilePhone();
		
		MobilePhone googlePhone = new MobilePhone();
		
		
		//Assigning a value to variable
		samsungPhone.brand = "Samsung";
		
		applePhone.brand = "Apple";
		
		googlePhone.brand = "Google";
		
		//Invoke a method
		samsungPhone.makeCall();
		
		
		
		
		
		
		
		

	}

}
