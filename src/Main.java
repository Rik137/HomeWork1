import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int firstNumber = scanner.nextInt();
        System.out.println("введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("введите третье число");
        int thirdNumber = scanner.nextInt();
        int sum = calculateNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("сумма всех чисел равно " + sum);
    }

    public static int calculateNumber(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}