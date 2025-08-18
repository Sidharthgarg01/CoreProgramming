import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (integer): ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent (non-negative integer): ");
        int exponent = scanner.nextInt();

        long result = (long) Math.pow(base, exponent);

        System.out.println("Result: " + result);

        scanner.close();
    }
}

