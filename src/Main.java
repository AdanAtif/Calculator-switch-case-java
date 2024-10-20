import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double number2 = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("What Operation do you want to perform? ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
            case "div":
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.print("%s is a unsupported operation.");
                break;
        }
        scanner.close();
    }
}