import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("This program finds the factorial of the number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");

        if (scanner.hasNextLine()) {
            String numberString = scanner.nextLine();
            try {
                int numberInt = Integer.parseInt(numberString);
                if (numberInt >= 0) {
                    scanner.close();
                    System.out.println(factorial(numberInt));
                } else {
                    scanner.close();
                    System.out.println("Sorry, write a positive number. Restart the program and try again.");
                }
            } catch (NumberFormatException e) {
                scanner.close();
                System.out.println("Sorry, but this is not a number. Restart the program and try again!");
                return;
            }
        }
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) return result;
        result = n * factorial(n - 1);
        return result;
    }
}
