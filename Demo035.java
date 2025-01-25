import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The bigger number is: " + num1);
        } else if (num1 < num2) {
            System.out.println("The bigger number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
