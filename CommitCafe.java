
public class CommitCafe {

    // STUDENT_TODO_1A: Change name
    private static String barista = "Alex";

    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String title = "Master Barista";

    private static int cups = 0;

    public static void brew(String drink) {

        // STUDENT_TODO_2A: Add 1 to cups & print a message
        // STUDENT_TODO_2B: Add a second brew-related improvement

        // Improvement: Check for invalid drink names
        if (drink == null || drink.trim().isEmpty()) {
            System.out.println("[ERROR] Invalid drink name.");
            return;
        }

        // Remove unnecessary spaces
        drink = drink.trim();

        cups++;

        System.out.println("[BREW] " + barista + " (" + title +
                ") brewed " + drink + ". Cup #" + cups);
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista +
                " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
