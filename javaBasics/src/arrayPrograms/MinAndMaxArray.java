package arrayPrograms;

import java.util.Arrays;

public class MinAndMaxArray {

	public static void main(String[] args) {
		
		int []a= {34,22,12,23,12,3,4,44,38,89};
		int minNumber = Arrays.stream(a).min().getAsInt();
		//stream():- Returns a sequential IntStream with the specified array as its source.
		System.out.println("Min Number "+minNumber);
		
		int maxNumber = Arrays.stream(a).max().getAsInt();
		
		System.out.print("Max Number "+maxNumber);
		
		
		
	}

}
