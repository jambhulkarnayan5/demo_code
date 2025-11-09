package basics;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        int num = 153; // The number we want to check
        int temp = num; // Store the original number for comparison later
        int r; // Remainder of num
        int sum = 0; // Initialize sum of cubes of digits

        // Loop through each digit of the number
        while (num > 0) {
            r = num % 10; // Extract the last digit
            sum = (r * r * r) + sum; // Calculate cube of the digit and add to sum
            num = num / 10; // Move to the next digit by removing the last digit
        }

        // After the while loop, sum should contain the sum of cubes of digits

        // Check if the sum of cubes of digits equals the original number
        if (temp == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong Number");

    }

}
