public class CommitCafe {

    private static String barista = "CoffeeBot"; // STUDENT_TODO_1A: Change name
    private static String title = "[Lead Barista]";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Merge conflicts taste better with espresso.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}