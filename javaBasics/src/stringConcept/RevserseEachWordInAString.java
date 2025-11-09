package stringConcept;

public class RevserseEachWordInAString {

	public static void main(String[] args) {

		String input = "Welcome to java";
		String output = "";
		String[] words = input.split(" ");

		for (String word : words)

		{
			String revword = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				revword = revword + word.charAt(i);

			}
			output = output + revword + " ";
		}
		System.out.println("Reverse string: " + output);
	}
}

// Approch2

/*
 * String str = "Welcome to java"; 
 * String[] words= str.split("\\s ");
 * 
 * String reverseWord= "";
 *  for(String w:words)
 *   { StringBuilder sb = new StringBuilder(w); 
 * sb.reverse();
 * 
 * reverseWord=reverseWord+sb.toString()+" "; }
 * 
 * System.out.println(reverseWord); }
 * 
 * } // Reverse string is: avaj ot emocleW
 */
