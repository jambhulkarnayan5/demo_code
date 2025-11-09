package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateEleArray {
	
	public static void main(String[] args) {
		int a[] = {3,4,7,2,3,7};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(set.add(a[i]) == false) {
				System.out.println("Duplicated in the array:"+a[i]);
			}
		}

}
}