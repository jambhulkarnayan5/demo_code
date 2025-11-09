package collection;

//Java Program to Iterate over Arraylist
		// using for Each loop
import java.util.*;
public class ArrayListIteration {

	public static void main(String[] args) {
		
				// Declaring and initializing ArrayList
				List<Integer> numbers
					= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

				// For Each Loop for iterating ArrayList
				for (Integer i : numbers)

					// Printing the elements of ArrayList
					System.out.print(i + " ");
				System.out.println();
				
				
				ArrayList<String> al = new ArrayList<String>();
				 
		        // Adding elements to above List
		        // using add() method
		        al.add("g");
		        al.add("e");
		        al.add("e");
		        al.add("k");
		        al.add("s");
		 
		        // Printing all elements of Collection (ArrayList)
		      //  System.out.println(al);
		        
		        Iterator<String> itr = al.iterator();

		        // Printing the stack
		        while (itr.hasNext()) {
		            System.out.print(itr.next() + " ");
		        }
		        
		        
		        
		     // Declaring the ArrayList with
		        // initial size n
		        ArrayList<Integer> al1 = new ArrayList<Integer>();

		        // Appending new elements at
		        // the end of the list
		        for (int i = 1; i <= 5; i++)
		            al1.add(i);

		        // Printing elements
		        System.out.println(al1);
			}
		

	}


