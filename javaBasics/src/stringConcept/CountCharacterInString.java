
// Count character in string
package stringConcept;

public class CountCharacterInString {

	public static void main(String[] args) {
		 String s = "Java programming selenium hello world";
		 int totalCount=s.length();
		 int tCount_afterRemove = s.replaceAll("o", "").length();
		 int count = totalCount- tCount_afterRemove;
		 System.out.println(count);
		 
	

	}

}
