package stringConcept;

public class VowelsInString {

	public static void main(String[] args) {
		
//		String str = "Testing Application of the country";
//		String vowels = "aeiouAEIOU";
//		String output ="";
//		for(char c: str.toCharArray()) {
//			if(vowels.indexOf(c)==-1) {
//				output= output+c;
//			}
//		}
//		System.out.print(output);
		
		String str = "Testing Application of the country";
		String withoutvowel = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(withoutvowel);	
		
		
}
}


