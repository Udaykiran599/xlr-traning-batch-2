import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Swapping the numbers
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
