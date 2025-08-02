import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Electricity Bill Calculator");
            System.out.println("1. Calculate Bill");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1/2): ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        calculateBill();
                        break;
                    case 2:
                        System.out.println("Thank You!");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    private static void calculateBill() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of units consumed: ");
            int units = scanner.nextInt();

            if (units < 0) {
                throw new IllegalArgumentException("Units consumed cannot be negative.");
            }

            double totalAmount = calculateTotalAmount(units);

            System.out.println("Electricity Bill Calculation:");
            System.out.println("Units Consumed: " + units);
            System.out.println("Total Amount (INR): " + totalAmount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear invalid input
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double calculateTotalAmount(int units) {
        double totalAmount;
        if (units <= 100) {
            totalAmount = units * 1.20;
        } else if (units <= 300) {
            totalAmount = 100 * 1.20 + (units - 100) * 2.00;
        } else {
            totalAmount = 100 * 1.20 + 200 * 2.00 + (units - 300) * 3.00;
        }
        return totalAmount;
    }
}
