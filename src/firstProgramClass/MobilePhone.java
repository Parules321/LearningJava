package firstProgramClass;

public class MobilePhone {

	// variables
	// DataType variableName;
	// we do not provide value for variables in the template class as we need to
	// provide value in the actual class which we run or the main class.
	// Hence we have commented the belwo values here.

	String color; // = "red"; //alphanumeric and special characters allowed
	String modelName; // = "S22";
	String brand;

	// DataType for whole numbers - short, byte, int, long

	int screenSize;// = 6;

	// DataType for decimal values - float and double

	double price;// = 1000.75;
	double version;// = 13.5987676898765489987;

	boolean isTheBrandApple;// = true;

	char singleCharacter;// = 'Y';

	String doesItHaveBluetooth;// = "Yes";

	// Functions - Methods

	void makeCall() {
		System.out.println("Making call to a contact");
	}

}
