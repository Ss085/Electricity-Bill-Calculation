import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateBill {

    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of units consumed: ");
            int units = scanner.nextInt();

            if (units < 0) {
                throw new IllegalArgumentException("Units consumed cannot be negative.");
            }

            double totalAmount = CalculateTotalAmount.calculate(units);

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
}
