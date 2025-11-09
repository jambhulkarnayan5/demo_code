
//Remove duplicate string element from the array

package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArray1 {

	public static void main(String[] args) {
		
		String a[] = {"Java", "Java", "C", "Python", "Python", "Abc","Abc"};
		
		HashSet<String> set = new HashSet<String>();
		//for (String i=0; i<a.length; i++)
		for(String s:a)
		{
			set.add(s);
		
		}
	
		System.out.println("Remove duplicate element: "+set);
	String[] b=set.toArray(new String[set.size()]);
		System.out.println("Remove duplicate element with sorted array: "+Arrays.toString(b));
		
		
		
		
}
}
