package stringConcept;

import java.util.*;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String s1 = "LISTEN";
		String s2 = "SILENT";
		char c1[]= s1.toCharArray(); // converts these strings into character Array
		char c2[]= s2.toCharArray();
		
		if(c1.length != c2.length) // we have to check length, if it is not equal then program print the statement
			                         // 'Not Anagram' & exit the program.
         {
			System.out.println("Not Anagram");
			System.exit(0);
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		// we have to check index of the string, if it is not equal then program print the statement
        // not Anagram & exit the program.

		for(int i=0; i<c1.length;i++)
		{
			if (c1[i] !=  c2[i])
			{
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
			
		System.out.println("It is Anagram");
	}

}
