package arrayIntQuestionsAssignment;

public class SortAscending {

	double[] arrayOriginal = { 65, 76.5, 32, 54, 2.08, 93 };

	void ascendingOrder() {

		double temp = 0;

		for (int i = 0; i < arrayOriginal.length; i++) {
			for (int j = i + 1; j < arrayOriginal.length; j++) {

				if (arrayOriginal[j] < arrayOriginal[i]) {

					temp = arrayOriginal[i];
					arrayOriginal[i] = arrayOriginal[j];
					arrayOriginal[j] = temp;

				}

			}
		}
		System.out.println("Elements of this array in ascending order: ");
		for (int i = 0; i < arrayOriginal.length; i++) {
			System.out.println(arrayOriginal[i]);
		}
	}

}
