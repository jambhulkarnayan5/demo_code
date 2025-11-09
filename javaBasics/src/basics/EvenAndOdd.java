//CoudTech
package basics;

import java.util.Arrays;
import java.util.List;

public class EvenAndOdd {
	
	    public static void main(String[] args) {
	        
	        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
	    	
	  
	        numbers.stream().filter(n -> n%2==0).forEach(System.out::println); //even
	        System.out.println();
	        numbers.stream().filter(n -> n%2==1).forEach(System.out::println); //odd
	      
	    }
	}


