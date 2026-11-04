import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

        String[] ingredients = { "Rice", "Egg", "Garlic", "Onion", "Noodles", "Tuna", "Sardines", "Chicken",
                "Soy Sauce", "Vinegar", "Potato", "Corned Beef", "Eggplant", "Bread", "Pasta", "Bay Leaves",
                "Cooking Oil", "Salt", "Pepper" }; // Indexes: 0-18

        String[] dishes = { "Egg Fried Rice", "Garlic Fried Rice", "Tuna Pasta", "Chicken Adobo", "Sardines with Rice",
                "Eggplant Omelette", "Corned Beef Hash", "Potato Soup", "Egg Sandwich" }; // Indexes: 0-8

        String[][] availableIngredients = {
                { "Rice", "Egg", "Garlic", "Onion", "Cooking Oil" }, // Egg Fried Rice
                { "Rice", "Garlic" }, // Garlic Fried Rice
                { "Pasta", "Tuna", "Garlic" }, // Tuna Pasta
                { "Chicken", "Soy Sauce", "Vinegar", "Garlic" }, // Chicken Adobo
                { "Sardines", "Garlic", "Rice", "Cooking Oil" }, // Sardines with Rice
                { "Eggplant", "Egg" }, // Eggplant Omelette
                { "Corned Beef", "Garlic", "Onion" }, // Corned Beef Hash
                { "Potato" }, // Potato Soup
                { "Bread", "Egg" } // Egg Sandwich
        };
        String[] recipe = {
                "1. Cook rice and let it cool.\n2. Heat oil in a pan and sauté garlic and onion.\n3. Add the cooled rice and stir-fry.\n4. Add beaten eggs and cook until done.\n5. Season with salt and pepper.", // Egg Fried Rice
                                                                                                                                                                                                                                                                                                                                                         
                "1. Boil pasta until al dente.\n2. Drain and set aside.\n3. In a pan, heat oil and sauté garlic.\n4. Add tuna and cook for a few minutes.\n5. Add the cooked pasta and mix well.\n6. Season with salt, pepper, and optional herbs.", // Tuna Pasta
                                                                                                                                                                                                                                                    
                "1. Marinate chicken with soy sauce, vinegar, garlic, and bay leaves.\n2. Heat oil in a pan and brown the chicken.\n3. Pour in the marinade and simmer until chicken is cooked through.", // Chicken Adobo
                                                                                                                                                                                                        
                "1. Heat oil in a pan and sauté garlic.\n2. Add sardines and cook for a few minutes.\n3. Serve with steamed rice.", // Sardines With Rice
                                                                                                                                  
                "1. Slice eggplant thinly.\n2. Beat eggs in a bowl.\n3. Dip eggplant slices in beaten eggs.\n4. Fry until golden brown.", // Eggplant Omelette
                                                                                                                                         
                "1. Heat oil in a pan and sauté garlic and onion.\n2. Add corned beef and cook until heated through.", // Corned Beef Hash
                                                                                                                      
                "1. Peel and chop potatoes into cubes.\n2. Boil potatoes until tender.\n3. Mash potatoes or leave them chunky as desired.\n4. Season with salt, pepper, and optional herbs.", // Potato Soup
                                                                                                                                                                                            
                "1. Toast bread slices.\n2. Fry or scramble eggs as desired.\n3. Assemble sandwich with eggs between toasted bread slices." }; // Egg Sandwich
                                                                                                                                              

        String[] userIngredients = new String[20];
        int count = 0; // Counter for userIngredients for indexing values

        System.out.println("Welcome to the Meal Suggestion App!");
        System.out.println("Please pick your ingredient:");

        for (int i = 0; i < ingredients.length; i++) { // Prints out the ingredients from the array
            System.out.println(i + ". " + ingredients[i]);
        }

        int choice = 0;
        while (true) {
            System.out.print("Pick a number (-1 to finish): "); // Input -1 to exit the loop
            choice = input.nextInt();

            if (choice == -1) {
                break;
            }

            if (choice >= 0 && choice < ingredients.length) { // If statement for checking if "choice" less than 0 and less than the ingredients length both needs to be true to proceed
                userIngredients[count] = ingredients[choice]; // Stores the selected ingredient to userIngredients
                count++; // This moves the next user input to the next index of the "userIngredients"
                         // Array

                System.out.println("Ingredient added!");
            } else {
                System.out.println("Invalid choice!");
            }

        }

        for (int i = 0; i < availableIngredients.length; i++) { // Loop through each dish's available ingredients

            boolean hasAllIngredients = true;

            for (int j = 0; j < availableIngredients[i].length; j++) { // Loop through each ingredient of the current dish

                boolean found = false;

                for (int c = 0; c < count; c++) { // Loop through the user's selected ingredients

                    if (availableIngredients[i][j].equals(userIngredients[c])) { // Check if the current dish's ingredient is in the user's selected ingredients
                        found = true;
                        break;
                    }
                }

                if (!found) { // If the current dish's ingredient is not found in the user's selected ingredients, set hasAllIngredients to false and break out of the loop
                    hasAllIngredients = false;
                    break;
                }
            }

            if (hasAllIngredients) { // If the user has all the ingredients for the current dish, print the dish name and recipe
                System.out.println();
                System.out.println("You can make: " + dishes[i]); // Print the name of the dish
                System.out.println("Recipe: " + recipe[i]); // Print the recipe for the dish
                System.out.println();
            } else {
                System.out.println();
                System.out.println("You don't have all the ingredients for: " + dishes[i]); // Print a message indicating that the user doesn't have all the ingredients for the dish
            }
        }
    }
    }
}
// Nalilito ako huhuhuhuhuh shit raming index
