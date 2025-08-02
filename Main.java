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
                        CalculateBill.execute();
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
}
