//Java Program To Count Occurrences Of Each Character in a String
//Programming Tutorials

package stringConcept;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		String str = "Nayan Jambhulkar";
		Map<Character,Integer> CharMapCount = new HashMap<>();
		
		for(Character c: str.toCharArray())   //toCharArray() - converts this string to a new character array.
		{ 
			if(CharMapCount.containsKey(c))   //if character is present in the map then we pick previous value & add 1 to them
			{
				CharMapCount.put(c, CharMapCount.get(c)+1);
			}
			else {
				CharMapCount.put(c, 1);
			}
		}
		System.out.println("count the occurrences of each character "+CharMapCount);
	}

}

/*1.Initializes a HashMap to store characters as keys and their counts as values.
2.Iterates through each character in the input string.
3. Checks if the character is already present in the map.
  a.If yes, increments its count by 1.
  b.If no, adds the character to the map with a count of 1.
4.Prints the map containing characters and their counts.*/
