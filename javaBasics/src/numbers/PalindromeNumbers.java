package numbers;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for palindrome");
		int num = sc.nextInt();

		int number, rev = 0;
		number = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;// 121%10;
			// 1=1*10+12%10;
			num = num / 10;
		}

		System.out.println("Revrse number is:"+  rev);

		if (number == rev) {
			System.out.println("This is palindrome Number");
		}

		else {

			System.out.println("This is not palindrome number");

		}
	}
}
