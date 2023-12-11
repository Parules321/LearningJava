package pizzaBillAssignment;

public class Pizza {

	String pizzaSize;
	int basePrice;
	int toppingPrice;
	int extraCheesePrice;

	public void getBasePrice() {
		if (pizzaSize.equalsIgnoreCase("Small")) {
			basePrice = 15;
		}
		if (pizzaSize.equalsIgnoreCase("Medium")) {
			basePrice = 20;
		}
		if (pizzaSize.equalsIgnoreCase("Large")) {
			basePrice = 25;
		}
		System.out.println(pizzaSize + ": Base price of the Pizza - $" + basePrice);

	}

	public void addPepperoniTopping() {
		if (pizzaSize.equalsIgnoreCase("Small")) {
			toppingPrice = 2;
			basePrice += 2;
		} else {
			toppingPrice = 3;
			basePrice += 3;
		}

		System.out.println("Pepporoni Topping Price - $" + toppingPrice);

	}

	public void addExtraCheese() {
		extraCheesePrice = 1;
		basePrice += 1;
		System.out.println("Extra Cheese Price - $" + extraCheesePrice);
	}

	public void calculateTotalBill() {
		System.out.println("Your final bill is $" + basePrice);
	}
}
