public class Demo019 {
    public static void main(String[] args) {
        // Example input: number of minutes
        long minutes = 5256000;

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
    }
}
