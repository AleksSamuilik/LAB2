import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Данная программа находит факториал необходимого вам числа.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        if (scanner.hasNextLine()) {
            String chislo = scanner.nextLine();
            try {
                number = Integer.parseInt(chislo);
                if (number > 0) {
                    scanner.close();
                    System.out.println(factorial(number));
                } else {
                    System.out.println("Извините, введите положительное число. Перезапустите программу и попробуйте снова!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
                return;
            }
        }


    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
