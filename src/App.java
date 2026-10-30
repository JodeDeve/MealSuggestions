
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array that stores the ingredients entered by the user
        String[] ingredients = new String[20];
        int count = 0;

        int choice = 0;

        System.out.println("=====================================");
        System.out.println("   BOARDING HOUSE MEAL SUGGESTER");
        System.out.println("=====================================");

        System.out.println("enter your ingredients: ");
        choice = input.nextInt();

        // Make sure the user types a number
        if (input.hasNextInt()) {
            choice = input.nextInt();
        } else {
            choice = 0;
        }
        input.nextLine(); // clear the leftover Enter key

        if (choice == 1) {
            // ---------- ADD INGREDIENTS ----------
            System.out.println();
            System.out.println("Examples: rice, egg, garlic, onion, noodles, tuna,");
            System.out.println("sardines, chicken, soy sauce, vinegar, potato,");
            System.out.println("corned beef, eggplant, bread");
            System.out.println("Type one ingredient at a time. Type 'done' to stop.");

            String item = "";

        }

    }
}
