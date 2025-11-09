package basics;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int term, a=0,b=1,c;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Print term:");
		term=sc.nextInt();
		
		for(int i=1;i<=term;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
		
	}

}
