package arrayPrograms;

import java.util.Arrays;

public class MeanAndMeadianArray {

	public static void main(String[] args) {
		
		//declare an integer type array and store some random integer values
		int inputArray[] = {7,2,3,4,5,6};
		//declare an integer variable to store the length of the given array 
		int len = inputArray.length;
		
		
		//call the user defined method and print the output
		System.out.println("Mean of the given array "+Arrays.toString(inputArray)+ " is = "+mean(inputArray, len));
		System.out.println("Median of the given array "+Arrays.toString(inputArray)+ " is = "+median(inputArray, len)); 
	}
	
	// user defined function to find mean value
	public static double mean(int arr[], int len)
	{  
		int sum=0;   //declare a Integer variable to store the sum value of given array's elements
		//initiate the loop to calculate the sum value of all the elements of given array
		for(int i=0;i<len; i++)
			sum=sum+arr[i];
		System.out.println("Sum: " +sum);
		//return the mean value
		return (double)(arr[(len-1)/2]+arr[len/2])/2.0;	
	}
	
	//user defined function to find median value 
	public static double median(int arr[], int len)
	{   // sort the given array in ascending order
		Arrays.sort(arr);
		// check whether the given array consists of even or odd number of elements
		if (len%2!=0) {
			return (double) arr[len/2];	
		}
		return (double) (arr[(len-1)/2] +arr[len/2])/2.0;
	}

}
