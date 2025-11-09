package arrayPrograms;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {
// Java program to remove the duplicates from the Array with the help of HashSet

	public static void main(String[] args) {
		int a[] = {8,8,1,1,9,9,2,4,6,8,9,3,3 };
		
		Set<Integer> set = new HashSet<Integer>();
		//for (int i=0; i<a.length; i++)   // set.add(a[i]);
		for(int arr:a) {
			set.add(arr);
			
		}
		System.out.println("Unique elements using HashSet: "+set);
		
	// we need to convert HashSet into Array	
	Integer[] b=set.toArray(new Integer[set.size()]);
		System.out.println("Array after removing duplicates: "+Arrays.toString(b));
	
		
		
		

	}

}

