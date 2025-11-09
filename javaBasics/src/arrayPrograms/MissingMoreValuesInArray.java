package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class MissingMoreValuesInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 6, 13, 8, 9, 11 }; // Example array with missing values
		int startRange = 1; // Start of the range
		int endRange = 13; // End of the range

		Set<Integer> set = new HashSet<>();

		// Add all elements from array to the HashSet
		for (int num : arr) {
			set.add(num);
		}

		// Print missing numbers in the range
		System.out.println("Missing values in the range " + startRange + " to " + endRange + ":");
		for (int i = startRange; i <= endRange; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
			}

		}
	}
}
