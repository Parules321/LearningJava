package pizzaBillAssignment;

import java.util.Scanner;

public class MainPizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza pizza = new Pizza();

		boolean isToppingSelected;

		boolean isExtraCheeseSelected;

		System.out.println("Please type the size of Pizza you want - Small, Medium or Large.");

		pizza.pizzaSize = sc.next();

		pizza.getBasePrice();

		System.out.println("Is additonal pepporoni topping selected? Please type true or false.");

		isToppingSelected = sc.nextBoolean();

		if (isToppingSelected) {
			pizza.addPepperoniTopping();
		}

		System.out.println("Is extra cheese selected? Please type true or false.");

		isExtraCheeseSelected = sc.nextBoolean();

		if (isExtraCheeseSelected) {
			pizza.addExtraCheese();
		}

		pizza.calculateTotalBill();

	}

}
