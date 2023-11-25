package multiDimensionalArrayAssignment;

import java.util.Scanner;

public class Phones {
	Scanner sc = new Scanner(System.in);
	String[][] phones = { { "S20", "S21", "Flip3", "Fold3" },
			{ "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" },
			{ "Iphone12", "IphoneSE", "Iphone15", "Iphone13" } };

	void showAndSelectAvaialblePhone() {

		System.out.println("Please choose from the phone brand - Samsung, Google or Apple and enter.");

		String phoneBrand = sc.next();
		boolean phoneFound = false;
		String productName;

		switch (phoneBrand) {
		case "Samsung":
			System.out.println("Available products in this brand are:- " + phones[0][0] + ", " + phones[0][1] + ", "
					+ phones[0][2] + " and " + phones[0][3]);
			System.out.println("Please select a product name from the list and enter.");
			productName = sc.next();
			for (int i = 0; i < phones[0].length; i++) {
				if (productName.equalsIgnoreCase(phones[0][i])) {
					phoneFound = true;
					System.out.println("Product selected is: " + phones[0][i]);
				}
			}
			if (phoneFound == false) {
				System.out.println("Please select a product from the list");
			}
			;
			break;

		case "Google":
			System.out.println("Available products in this brand are:- " + phones[1][0] + ", " + phones[1][1] + ", "
					+ phones[1][2] + " and " + phones[1][3]);
			System.out.println("Please select a product name from the list and enter.");
			productName = sc.next();
			for (int i = 0; i < phones[1].length; i++) {
				if (productName.equalsIgnoreCase(phones[1][i])) {
					phoneFound = true;
					System.out.println("Product selected is: " + phones[1][i]);
				}
			}
			if (phoneFound == false) {
				System.out.println("Please select a product from the list");
			}
			;
			break;

		case "Apple":
			System.out.println("Available products in this brand are:- " + phones[2][0] + ", " + phones[2][1] + ", "
					+ phones[2][2] + " and " + phones[2][3]);
			System.out.println("Please select a product name from the list and enter.");
			productName = sc.next();
			for (int i = 0; i < phones[2].length; i++) {
				if (productName.equalsIgnoreCase(phones[2][i])) {
					phoneFound = true;
					System.out.println("Product selected is: " + phones[2][i]);
				}
			}
			if (phoneFound == false) {
				System.out.println("Please select a product from the list");
			}
			;
			break;

		default: {
			System.out.println("Phone brand not found in the system.");
		}
			;
			break;

		}

	}
}
