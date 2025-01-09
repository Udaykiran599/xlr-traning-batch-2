import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        // Calculate years and remaining days
        long totalDays = minutes / (minutesInHour * hoursInDay);
        long years = totalDays / daysInYear;
        long remainingDays = totalDays % daysInYear;

        // Output the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");

        // Close the scanner
        scanner.close();
    }
}
