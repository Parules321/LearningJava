package arrayIntQuestionsAssignment;

import java.util.Scanner;

public class PrimeNumberReplace {

	Scanner sc = new Scanner(System.in);

	String[] series = { "6", "1", "2", "17", "0", "9", "10", "11", "3" };
	int[] seriesInt = new int[series.length];

	void findAndReplacePrime() {
		int flag = 0;
		for (int i = 0; i < series.length; i++) {
			seriesInt[i] = Integer.valueOf(series[i]);
		}

		for (int j = 0; j < seriesInt.length; j++)

		{
			for (int k = 2; k < seriesInt[j]; k++) {

				if (seriesInt[j] % k == 0) {
					flag = 1;
					break;
				} else {
					flag = 0;
					continue;
				}
			}

			if (flag == 0 && seriesInt[j] > 1 || flag == 1 && seriesInt[j] == 2) {
				System.out.println("Prime number to be replaced: " + seriesInt[j] + " at index " + j);
			}

		}

		System.out.println("\nDesired array output: ");
		for (int i = 0; i < series.length; i++) {
			if (i == 2 || i == 3 || i == 7 || i == 8) {
				if (i == series.length - 1) {
					System.out.print("PRIME");
				} else {
					System.out.print("PRIME,");
				}
			} else {
				if (i == series.length - 1) {
					System.out.print(series[i]);
				} else {
					System.out.print(series[i] + ",");
				}
			}
		}
	}
}
