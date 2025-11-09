package arrayPrograms;

import java.util.Arrays;

public class ReversedArray {
	
	    public static void main(String[] args) {
	        int a[] = {8,9,3,4,5,6};
	        int i=0, j=a.length-1, temp;
	      //  Arrays.sort(a);
	      //  System.out.println("Sorted array is  "+Arrays.toString(a));
	        while(i<j){
	            
	            temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	            
	            i++;
	            j--;
	            
	        }
	        System.out.println("Reversed array is  " +Arrays.toString(a));
	        
	    }
	}


