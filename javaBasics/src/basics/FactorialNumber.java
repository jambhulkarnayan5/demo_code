package basics;

public class FactorialNumber {

    public static void main(String[] args) {
        int fact = 1; // Initialize factorial variable to 1
        int number = 5; // Number for which factorial is calculated
        
        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            fact = fact * i; // Multiply factorial by current loop index
        }
        
        // Print the result
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
