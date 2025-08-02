public class CalculateTotalAmount {

    public static double calculate(int units) {
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
