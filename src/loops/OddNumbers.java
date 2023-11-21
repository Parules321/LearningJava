package loops;

public class OddNumbers {

	void printOddNumbersTillTen() {
		for (int i = 1; i < 10; i += 2) {

			System.out.println("odd numbers" + i);

		}

	}

	void printOddNumbersTillTenWayTwo() {
		int num = 1;
		for (int i = 0; i < 5; i++) {
			
			System.out.println("odd numbers 2nd way: " + num);
			num += 2;

		}

	}

}
