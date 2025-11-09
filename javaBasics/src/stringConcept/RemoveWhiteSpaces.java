package stringConcept;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = " Java      programming      selenium    hello         world";
		
		System.out.println("Before removing the white spaces:" +str);
		
	 str=	str.replaceAll(" ", "");
		System.out.println("After removing the white spaces:" +str);
		
	}

}
