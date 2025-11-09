package stringConcept;

public class ReverseString {

	public static void main(String[] args) {
	
	  String s = "Welcome to java";
	//  Char f = s.charAt(5);
	  String rev = " ";
	  
	  for(int i=s.length()-1;i>=0;i--) {
		  
		  rev = rev+s.charAt(i); // charAt(i)-> returns the char value at specified index
	  }
	  
	  System.out.println("Reverse string is:" +rev);
	  
//	  System.out.println(s.length());
//	  System.out.println(s.charAt(4));
//	  System.out.println(s);
	  

	}

}
