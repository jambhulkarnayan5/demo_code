package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrograme {

	public static void main(String[] args)
    {
 
        // Arrays
		float[][] array = {{1.2f, 2.5f}};  
		//System.out.println(Arrays.deepToString(array));  
		
		int [] a = {2,4,5,7};
		Object []a1= {"J","P","TY","PK" };
        // Trying printing the above array
      //  System.out.print(gfg);
       System.out.println(Arrays.toString(a1));  
       System.out.println(Arrays.asList(a));
        
       for (int i=0;i<a.length;i++) {
    	 
               System.out.print(a[i] + " ");  
        	
        }
       System.out.println();
       for (int str : a)   
       {  
       System.out.print(str +" ");  
       }  
       
 
        // New Line
        System.out.println();
 
        // Collection
        // Let us arbitarly create an empty ArrayList
        // of string type
        ArrayList<String> al = new ArrayList<String>();
 
        // Adding elements to above List
        // using add() method
        al.add("g");
        al.add("e");
        al.add("e");
        al.add("k");
        al.add("s");
 
        // Printing all elements of Collection (ArrayList)
        System.out.println(al);
    }

		

	}


