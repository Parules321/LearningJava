package Operators;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person parul = new Person(); 
		parul.age = 16;
		System.out.println("Parul's age:" + parul.age );
		
		System.out.println("It's Parul's b'day, increase her age by 1");
		
		parul.increaseTheAgeBy1();
		System.out.println("Parul's age" + parul.age);
		
		parul.savings = 3000;
		parul.calculateInterestOnSavings();
		System.out.println("savings in Parul's account:" + parul.savings);

	}
}


