package stringConcept;
import java.util.HashSet;
import java.util.Set;
public class UniqueCharFromTwoString {
	

	

	    public static void main(String[] args) {
	        String str1 = "Sagar";
	        String str2 = "Nayan";

	        Set<Character> uniqueChars = new HashSet<>();

	        // Add all characters from str1 to the set
	        for (Character c : str1.toCharArray()) {
	            uniqueChars.add(c);
	        }

	        // Add all characters from str2 to the set
	        for (Character c : str2.toCharArray()) {
	            uniqueChars.add(c);
	        }

	        // Now uniqueChars set contains all unique characters from str1 and str2

	        // Print out the unique characters
	        System.out.println("Unique characters from both strings:");
	        for (char c : uniqueChars) {
	            System.out.print(c + " ");
	        }
	       // System.out.println("Unique characters");
	    }
	}



