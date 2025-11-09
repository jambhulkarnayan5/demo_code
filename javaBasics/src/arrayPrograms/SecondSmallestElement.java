package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class SecondSmallestElement {

	public static void main(String[] args) {

		
		int array[] = {4, 1, 5, 7, 8 };
		int temp, len;
		len = array.length;
		
		
		
//		{
//			HashSet<Integer> set = new HashSet<Integer>();
//			for (int i=0; i<len; i++)
//				set.add(array[i]);
//			System.out.println("Remove duplicate element with sorted array: "+set);
//			
//			
//		}

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
			System.out.print(array[i]+ " ");
			
			
		}
		
		System.out.println();
		System.out.println("2nd smallest element of the array: "+array[1]);
		
	}
	

}
