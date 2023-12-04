package arrayIntQuestionsAssignment;

public class ReverseArrayElements {

	String[] alphabets = { "a", "b", "c", "d", "e", "f", "g" };

	void reverseElements() {
		System.out.println("Elements of the array in reverse order: ");

		for (int j = alphabets.length - 1; j >= 0; j--) {
			if (j == 0) {
				System.out.print(alphabets[j]);
			} else {
				System.out.print(alphabets[j] + ", ");
			}
			;
		}

	}

}
