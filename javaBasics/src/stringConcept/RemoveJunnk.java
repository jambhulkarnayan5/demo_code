package stringConcept;

public class RemoveJunnk {

	public static void main(String[] args) {
		String s = "TEST FURNITURE-34_TEST&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp";
		String s1 = "@#&@#% Selenium !@#$@java";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.print(s1);
				
	}

}
