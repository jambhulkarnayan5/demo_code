package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n, count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = sc.nextInt();

		// num will divisible by 1 & its own so it should start with i=1
		for (int i = 1; i <= n; i++) 
		{
			if (n % i == 0) // it will generate n%i ==0 then count will increase to 1 & if (rem) not equals
							// to zero, count not increase & control move to for loop again
				count++;
		}

		if (count == 2)
			System.out.print("Prime Number");
		else
			System.out.print("not Prime Number");

	}
}
