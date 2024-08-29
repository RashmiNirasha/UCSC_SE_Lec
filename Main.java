
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        // Looping through numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Calling a method to demonstrate basic calculations
        demonstrateCalculations();

        // Displaying a farewell message
        System.out.println("Thank you for running the program. Goodbye!");
    }

    // A method to demonstrate basic calculations
    private static void demonstrateCalculations() {
        int a = 10;
        int b = 5;

        // Basic arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        // Displaying the results of calculations
        System.out.println("\nBasic Calculations:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
