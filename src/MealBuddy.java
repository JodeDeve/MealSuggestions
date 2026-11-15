import java.util.Scanner;

public class MealBuddy {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            boolean retry = true;
            boolean program = true;

            String[] ingredients = { "Egg", "Tomato", "Onion", "Cooking Oil", "Salt", "Eggplant", "Garlic", "Rice",
                    "Chicken", "Vinegar", "Soy Sauce", "Pepper", "Bay Leaf", "Pork", "Corned Beef", "Sardines",
                    "Hotdog", "Ketchup", "Luncheon Meat", "Instant Noodles", "Calamansi", "Mung Beans", "Dried Fish",
                    "Cabbage", "Ginger", "Fish Sauce", "Sinigang Mix", "Milk", "Tablea", "Sugar" }; // Array of
                                                                                                    // ingredients

            String[] dishes = { "Egg Tomato Scramble", "Tortang Talong", "Egg Rice", "Chicken Adobo", "Pork Adobo", // Array of dishes
                    "Corned Beef", "Sardines Meal", "HotSilog", "Luncheon Meat", "Pancit Canton", "Monggo", "Tuyo",
                    "Cabbage Veggie Meal", "Tinola", "Sinigang", "Champorado" };
            String[][] availableIngredients = { // These are the ingredients needed for each dish, in the same order as the dishes array
                    { "Egg", "Tomato", "Onion", "Cooking Oil", "Salt" }, // Egg Tomato Scramble
                    { "Eggplant", "Egg", "Cooking Oil", "Salt" }, // Tortang Talong
                    { "Egg", "Rice", "Cooking Oil", "Salt", "Garlic" }, // Egg Rice
                    { "Chicken", "Vinegar", "Soy Sauce", "Pepper", "Bay Leaf", "Cooking Oil" }, // Chicken Adobo
                    { "Pork", "Vinegar", "Soy Sauce", "Pepper", "Bay Leaf", "Cooking Oil" }, // Pork Adobo
                    { "Corned Beef", "Garlic", "Onion", "Cooking Oil" }, // Corned Beef
                    { "Sardines", "Garlic", "Onion", "Tomato", "Cooking Oil" }, // Sardines Meal
                    { "Hotdog", "Ketchup", "Rice", "Egg", "Cooking Oil", "Garlic" }, // HotSilog
                    { "Luncheon Meat", "Rice", "Egg", "Cooking Oil", "Garlic" }, // Luncheon Meat
                    { "Instant Noodles", "Calamansi", "Egg" }, // Pancit Canton
                    { "Mung Beans", "Garlic", "Salt", "Cooking Oil", "Onion" }, // Monggo
                    { "Dried Fish", "Tomato", "Vinegar", "Cooking Oil" }, // Tuyo
                    { "Salt", "Cabbage", "Garlic", "Onion", "Cooking Oil" }, // Cabbage Veggie Meal
                    { "Ginger", "Fish Sauce", "Cooking Oil", "Onion", "Garlic", "Salt", "Chicken" }, // Tinola
                    { "Sinigang Mix", "Tomato", "Onion", "Salt", "Pork" }, // Sinigang
                    { "Milk", "Tablea", "Sugar", "Rice" }, // Champorado
            };
            String[] recipe = {
                    "Step 1: Chop the tomato and onion.\nStep 2: Sauté them in oil until soft.\nStep 3: Beat the eggs with salt and pour them into the pan.\nStep 4: Stir until cooked. Serve with rice.\n", // Egg
                                                                                                                                                                                                             // Tomato
                                                                                                                                                                                                             // Scramble
                    "Step 1: Grill or boil the eggplant until soft, then peel it. \nStep 2: Flatten the eggplant with a fork and dip it in beaten egg mixed with salt. \nStep 3: Fry in hot oil for 2 to 3 minutes per side until golden. \nStep 4: Serve with rice.\n", // Tortang
                                                                                                                                                                                                                                                                         // Talong
                    "Step 1: Fry minced garlic in oil until light golden. \nStep 2: Add leftover rice and salt. \nStep 3: Stir for 3 to 4 minutes, then set aside. \nStep 4: Fry an egg and put it on top of the rice.", // Egg
                                                                                                                                                                                                                         // Rice
                    "Step 1: Put the chicken, soy sauce, vinegar, crushed garlic, pepper, and bay leaf in a pot. \nStep 2: Bring to a boil. \nStep 3: Simmer covered for 25 to 30 minutes. \nStep 4: Simmer uncovered until the sauce thickens. Serve with rice.\n", // Chicken
                                                                                                                                                                                                                                                                     // Adobo
                    "Step 1: Put the pork, soy sauce, vinegar, crushed garlic, pepper, and bay leaf in a pot. \nStep 2: Bring to a boil. \nStep 3: Simmer covered for 35 to 45 minutes until tender, adding a little water if it gets dry. \nStep 4: Serve with rice.\n", // Pork
                                                                                                                                                                                                                                                                          // Adobo
                    "Step 1: Chop the garlic and onion. \nStep 2: Sauté them in oil until soft. \nStep 3: Add the corned beef and cook for 3 to 5 minutes, stirring. \nStep 4: Serve with rice.\n", // Corned
                                                                                                                                                                                                    // Beef
                    "Step 1: Chop the garlic, onion, and tomato. \nStep 2: Sauté them in oil until soft. \nStep 3: Add the sardines with their sauce, mash lightly, and simmer for 3 to 5 minutes. \nStep 4: Serve with rice.\n", // Sardines
                                                                                                                                                                                                                                  // Meal
                    "Step 1: Slice the hotdogs and fry them in oil until browned. \nStep 2: Fry an egg in the same pan. \nStep 3: Fry the rice with garlic (optional). \nStep 4: Put everything on a plate and add ketchup.\n", // HotSilog
                    "Step 1: Slice the luncheon meat. \nStep 2: Fry the slices in oil until browned on both sides. \nStep 3: Fry an egg in the same pan. \nStep 4: Serve with rice (fried with garlic if you like).\n", // Luncheon
                                                                                                                                                                                                                        // Meat
                    "Step 1: Boil the noodles for 2 to 3 minutes. \nStep 2: Drain, leaving a little water, then mix in the seasoning. \nStep 3: Fry or boil an egg. \nStep 4: Put the egg on top and squeeze calamansi over it.\n", // Pancit
                                                                                                                                                                                                                                    // Canton
                    "Step 1: Boil the mung beans for 25 to 30 minutes until soft. \nStep 2: Sauté garlic, onion, and tomato in oil. \nStep 3: Add the sautéed mix to the beans and season with salt. \nStep 4: Simmer for 5 to 10 minutes. Serve with rice.\n", // Monggo
                    "Step 1: Heat a little oil in a pan. \nStep 2: Fry the dried fish for 2 to 3 minutes per side until crisp. \nStep 3: Slice the tomato and prepare a vinegar dip. \nStep 4: Serve with rice.\n", // Tuyo
                    "Step 1: Slice the cabbage and chop the garlic and onion. \nStep 2: Sauté the garlic and onion in oil. \nStep 3: Add the cabbage and salt, then stir-fry for 4 to 5 minutes. \nStep 4: Serve with rice.\n", // Cabbage
                                                                                                                                                                                                                                // Veggie
                                                                                                                                                                                                                                // Meal
                    "Step 1: Sauté ginger, garlic, and onion in oil. \nStep 2: Add the chicken and cook until lightly browned. \nStep 3: Add fish sauce and enough water to cover, then simmer for 25 to 30 minutes. \nStep 4: Season with salt. Serve hot.\n", // Tinola
                    "Step 1: Boil the pork in water for 30 to 40 minutes until tender.\nStep 2: Add the onion and tomato.\nStep 3: Stir in the sinigang mix and salt, then simmer for 5 minutes.\nStep 4: Serve hot with rice.\n", // Sinigang
                    "Step 1: Boil the rice in about 3 cups of water until soft. \nStep 2: Add the tablea and stir until melted. \nStep 3: Simmer until thick, then add sugar. \nStep 4: Pour milk on top. Serve warm.\n" // Champorado
            };

            String[] userIngredients = new String[30]; // Array to store the ingredients selected by the user
            int count = 0; // Counter for userIngredients for indexing values

            while (program) {
                System.out.println("Welcome to the Meal Suggestion App!");
                System.out.println("Please pick your ingredient:");

                for (int i = 0; i < ingredients.length; i++) { // Prints out the ingredients from the array
                    System.out.println(i + ". " + ingredients[i]);
                }

                int choice = 0;
                while (true) {
                    System.out.print("Pick a number (-1 to finish): "); // Input -1 to exit the loop
                    if (input.hasNextInt()) { // Check if the input is an integer
                        choice = input.nextInt(); // Read the integer input
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        input.next(); // Clears the invalid input from the scanner buffer
                        continue; // Prompt the user again
                    }

                    if (choice == -1) {
                        break;
                    }

                    if (choice >= 0 && choice < ingredients.length) { // If statement for checking if "choice" less than
                                                                      // 0
                                                                      // and less than the ingredients length both needs
                                                                      // to
                                                                      // be true to proceed
                        userIngredients[count] = ingredients[choice]; // Stores the selected ingredient to
                                                                      // userIngredients
                        count++; // This moves the next user input to the next index of the "userIngredients"
                                 // Array

                        System.out.println("Ingredient added: " + "" + ingredients[choice]); // Prints out the selected
                                                                                             // ingredient

                    } else {
                        System.out.println("Invalid choice!");
                    }

                }

                for (int i = 0; i < availableIngredients.length; i++) { // Loop through each dish's available
                                                                        // ingredients

                    boolean hasAllIngredients = true;

                    for (int j = 0; j < availableIngredients[i].length; j++) { // Loop through each ingredient of the
                                                                               // current dish

                        boolean found = false;

                        for (int c = 0; c < count; c++) { // Loop through the user's selected ingredients

                            if (availableIngredients[i][j].equals(userIngredients[c])) { // Check if the current dish's
                                                                                         // ingredient is in the user's
                                                                                         // selected ingredients

                                found = true;
                                break;
                            }
                        }

                        if (!found) { // If the current dish's ingredient is not found in the user's selected
                                      // ingredients, set hasAllIngredients to false and break out of the loop
                            hasAllIngredients = false;
                            break;
                        }
                    }

                    if (hasAllIngredients) { // If the user has all the ingredients for the current dish, print the dish
                                             // name and recipe
                        System.out.println();
                        System.out.println("You can make: " + dishes[i]); // Print the name of the dish
                        System.out.println("Recipe: " + recipe[i]); // Print the recipe for the dish
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("You don't have all the ingredients for: " + dishes[i]); // Print a message
                                                                                                    // indicating that
                                                                                                    // the
                                                                                                    // user doesn't have
                                                                                                    // all
                                                                                                    // the ingredients
                                                                                                    // for
                                                                                                    // the dish
                    }

                }

                while (retry) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Would you like to try again? (yes/no)"); // Ask the user if they want to try
                                                                                 // again
                    String tryAgain = input.nextLine(); // Store the user's response in "tryAgain"

                    if (tryAgain.equalsIgnoreCase("yes")) {
                        break;
                    } else if (tryAgain.equalsIgnoreCase("no")) {
                        System.out.println();
                        System.out.println("Thank You For Using Our App! ");
                        System.out.println("Have A Great Day! ");
                        retry = false; // Set retry to false to exit the loop
                        program = false; // Set program to false to exit the outer loop
                    }
                }
            }
        }
    }
}
// Nalilito ako huhuhuhuhuh shit raming index
