
import java.util.Scanner;

public class NewTestPrototype {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) { // Start of the Scanner codenamed "input"

            boolean retry = true;
            boolean program = true;
            boolean menu = true;
            boolean foundany = false;

            String[] ingredients = { // Array of ingredients
                "Egg",
                "Tomato",
                "Onion",
                "Salt",
                "Eggplant",
                "Garlic",
                "Rice",
                "Chicken",
                "Vinegar",
                "Soy Sauce",
                "Pepper",
                "Bay Leaf",
                "Pork",
                "Corned Beef",
                "Sardines",
                "Hotdog",
                "Ketchup",
                "Luncheon Meat",
                "Instant Noodles",
                "Calamansi",
                "Monggo Beans",
                "Dried Fish",
                "Cabbage",
                "Ginger",
                "Fish Sauce",
                "Sinigang Mix",
                "Milk",
                "Tablea",
                "Sugar"
            };

            String[] dishes = { // Array of dishes
                "Egg Tomato Scramble",
                "Tortang Talong",
                "Egg Rice",
                "Chicken Adobo",
                "Pork Adobo",
                "Corned Beef",
                "Sardines Meal",
                "HotSilog",
                "Luncheon Meat",
                "Pancit Canton",
                "Monggo",
                "Tuyo",
                "Cabbage Veggie Meal",
                "Tinola",
                "Sinigang",
                "Champorado",
                "Scrambled Egg",
                "Boiled Egg",
                "Sunny Side Up",
                "Onion Omelet",
                "Egg Drop Soup",
                "Creamy Scrambled Egg",
                "Egg Rice Bowl",
                "Ketchup Egg Rice",
                "Adobong Itlog",
                "Plain Instant Noodles",
                "Crunchy Noodle Snack",
                "Egg Noodle Soup",
                "Corned Beef Noodles",
                "Sardines Noodles",
                "Hotdog Noodles",
                "Luncheon Meat Noodles",
                "Sinigang Noodles",
                "Ginisang Kamatis",
                "Roasted Tomato",
                "Tomato Onion Salad",
                "Tomato Soup",
                "Caramelized Onion",
                "Toasted Garlic",
                "Lugaw",
                "Garlic Rice",
                "Arroz Caldo",
                "Sweet Milk Rice",
                "Fish Sauce Fried Rice",
                "Fried Chicken",
                "Nilagang Manok",
                "Pan-Grilled Chicken",
                "Garlic Pepper Chicken",
                "Soy Garlic Chicken",
                "Simple Tinola",
                "Fried Pork",
                "Nilagang Baboy",
                "Pan-Grilled Pork",
                "Garlic Pepper Pork",
                "Soy Garlic Pork",
                "Pork Cabbage Stir-fry",
                "Sinigang na Manok",
                "Sinigang na Gulay",
                "Toyo-Suka Dip",
                "Sinamak",
                "Quick Pickled Onion",
                "Toyo-Mansi Dip",
                "Patis-Calamansi Dip",
                "Calamansi Juice",
                "Adobong Hotdog",
                "Fried Hotdog",
                "Boiled Hotdog",
                "Hotdog Egg Scramble",
                "Hotdog Ketchup Rice",
                "Fried Luncheon Meat",
                "Crispy Luncheon Meat Cubes",
                "Luncheon Meat Omelet",
                "Crispy Corned Beef",
                "Corned Beef and Egg",
                "Cornsilog",
                "Corned Beef Cabbage",
                "Ginisang Sardinas",
                "Sardines Omelet",
                "Monggo Soup",
                "Sweet Monggo",
                "Monggo with Pork",
                "Monggo with Tuyo",
                "Fried Dried Fish",
                "Grilled Dried Fish",
                "Tuyo with Vinegar",
                "Tuyo Garlic Rice",
                "Boiled Cabbage",
                "Stir-fried Cabbage",
                "Cabbage Salad",
                "Cabbage Egg Stir-fry",
                "Cabbage with Fish Sauce",
                "Ginger Tea",
                "Salabat",
                "Warm Milk",
                "Sikwate",
                "Tablea Hot Chocolate",
                "Simple Champorado",
                "Inihaw na Talong",
                "Fried Eggplant",
                "Boiled Eggplant",
                "Ensaladang Talong",
                "Adobong Talong"
            };

            String[][] availableIngredients = { // These are the ingredients needed for each dish, in the same order as the dishes array
                {"Egg", "Tomato", "Onion", "Salt"}, // Egg Tomato Scramble
                {"Eggplant", "Egg", "Salt"}, // Tortang Talong
                {"Egg", "Rice", "Salt", "Garlic"}, // Egg Rice
                {"Chicken", "Vinegar", "Soy Sauce", "Pepper", "Bay Leaf"}, // Chicken Adobo
                {"Pork", "Vinegar", "Soy Sauce", "Pepper", "Bay Leaf"}, // Pork Adobo
                {"Corned Beef", "Garlic", "Onion"}, // Corned Beef
                {"Sardines", "Garlic", "Onion", "Tomato"}, // Sardines Meal
                {"Hotdog", "Ketchup", "Rice", "Egg", "Garlic"}, // HotSilog
                {"Luncheon Meat", "Rice", "Egg", "Garlic"}, // Luncheon Meat
                {"Instant Noodles", "Calamansi", "Egg"}, // Pancit Canton
                {"Mung Beans", "Garlic", "Salt", "Onion"}, // Monggo
                {"Dried Fish", "Tomato", "Vinegar"}, // Tuyo
                {"Salt", "Cabbage", "Garlic", "Onion"}, // Cabbage Veggie Meal
                {"Ginger", "Fish Sauce", "Onion", "Garlic", "Salt", "Chicken"}, // Tinola
                {"Sinigang Mix", "Tomato", "Onion", "Salt", "Pork"}, // Sinigang
                {"Milk", "Tablea", "Sugar", "Rice"}, // Champorado
                {"Egg"}, // Scrambled Egg
                {"Egg"}, // bago Boiled Egg
                {"Egg"}, // baog Sunny Side Up
                {"Egg", "Onion"}, // Onion Omelet
                {"Egg", "Salt"}, // Egg Drop Soup
                {"Egg", "Milk"}, // bago Creamy Scrambled Egg
                {"Egg", "Rice", "Soy Sauce"}, // Egg Rice Bowl
                {"Egg", "Ketchup", "Rice"}, // Ketchup Egg Rice
                {"Egg", "Vinegar", "Soy Sauce", "Bay Leaf"}, // Adobong Itlog
                {"Instant Noodles"}, // Plain Instant Noodles
                {"Instant Noodles"}, // Crunchy Noodle Snack
                {"Instant Noodles", "Egg"}, // Egg Noodle Soup
                {"Corned Beef", "Instant Noodles"}, // Corned Beef Noodles
                {"Sardines", "Instant Noodles"}, // Sardines Noodles
                {"Hotdog", "Instant Noodles"}, // Hotdog Noodles
                {"Luncheon Meat", "Instant Noodles"}, // Luncheon Meat Noodles
                {"Sinigang Mix", "Instant Noodles"}, // Sinigang Noodles
                {"Tomato"}, // Ginisang Kamatis
                {"Tomato"}, // Roasted Tomato
                {"Tomato", "Onion"}, // Tomato Onion Salad
                {"Tomato", "Garlic", "Salt"}, // Tomato Soup
                {"Onion"}, // Caramelized Onion
                {"Garlic"}, // Toasted Garlic
                {"Rice"}, // Lugaw
                {"Garlic", "Rice"}, // Garlic Rice
                {"Rice", "Chicken", "Ginger", "Garlic"}, // Arroz Caldo
                {"Rice", "Milk", "Sugar"}, // Sweet Milk Rice
                {"Rice", "Garlic", "Fish Sauce"}, // Fish Sauce Fried Rice
                {"Chicken"}, // Fried Chicken
                {"Chicken"}, // Nilagang Manok
                {"Chicken"}, // Pan-Grilled Chicken
                {"Chicken", "Garlic", "Pepper"}, // Garlic Pepper Chicken
                {"Chicken", "Soy Sauce", "Garlic"}, // Soy Garlic Chicken
                {"Chicken", "Ginger", "Fish Sauce"}, // Simple Tinola
                {"Pork"}, // Fried Pork
                {"Pork"}, // Nilagang Baboy
                {"Pork"}, // Pan-Grilled Pork
                {"Pork", "Garlic", "Pepper"}, // Garlic Pepper Pork
                {"Pork", "Soy Sauce", "Garlic"}, // Soy Garlic Pork
                {"Pork", "Cabbage", "Garlic"}, // Pork Cabbage Stir-fry
                {"Sinigang Mix", "Chicken", "Tomato", "Onion"}, // Sinigang na Manok
                {"Sinigang Mix", "Cabbage", "Tomato", "Onion"}, // Sinigang na Gulay
                {"Vinegar", "Soy Sauce"}, // Toyo-Suka Dip
                {"Vinegar", "Garlic", "Pepper"}, // Sinamak
                {"Onion", "Vinegar", "Sugar"}, // Quick Pickled Onion
                {"Soy Sauce", "Calamansi"}, // Toyo-Mansi Dip
                {"Fish Sauce", "Calamansi"}, // Patis-Calamansi Dip
                {"Calamansi"}, // Calamansi Juice
                {"Hotdog", "Vinegar", "Soy Sauce", "Bay Leaf"}, // Adobong Hotdog
                {"Hotdog"}, // Fried Hotdog
                {"Hotdog"}, // Boiled Hotdog
                {"Hotdog", "Egg"}, // Hotdog Egg Scramble
                {"Hotdog", "Ketchup", "Rice"}, // Hotdog Ketchup Rice
                {"Luncheon Meat"}, // Fried Luncheon Meat
                {"Luncheon Meat"}, // Crispy Luncheon Meat Cubes
                {"Luncheon Meat", "Egg"}, // Luncheon Meat Omelet
                {"Corned Beef"}, // Crispy Corned Beef
                {"Corned Beef", "Egg"}, // Corned Beef and Egg
                {"Corned Beef", "Egg", "Rice"}, // Cornsilog
                {"Corned Beef", "Cabbage"}, // Corned Beef Cabbage
                {"Sardines", "Garlic", "Onion"}, // Ginisang Sardinas
                {"Sardines", "Egg"}, // Sardines Omelet
                {"Mung Beans"}, // Monggo Soup
                {"Mung Beans", "Sugar"}, // Sweet Monggo
                {"Mung Beans", "Pork", "Garlic", "Onion"}, // Monggo with Pork
                {"Mung Beans", "Dried Fish", "Garlic"}, // Monggo with Tuyo
                {"Dried Fish"}, // Fried Dried Fish
                {"Dried Fish"}, // Grilled Dried Fish
                {"Dried Fish", "Vinegar"}, // Tuyo with Vinegar
                {"Dried Fish", "Rice", "Garlic"}, // Tuyo Garlic Rice
                {"Cabbage"}, // Boiled Cabbage
                {"Cabbage"}, // Stir-fried Cabbage
                {"Cabbage"}, // Cabbage Salad
                {"Cabbage", "Egg"}, // Cabbage Egg Stir-fry
                {"Cabbage", "Fish Sauce", "Garlic"}, // Cabbage with Fish Sauce
                {"Ginger"}, // Ginger Tea
                {"Ginger", "Sugar"}, // Salabat
                {"Milk"}, // Warm Milk
                {"Tablea"}, // Sikwate
                {"Tablea", "Milk", "Sugar"}, // Tablea Hot Chocolate
                {"Rice", "Tablea", "Sugar"}, // Simple Champorado
                {"Eggplant"}, // Inihaw na Talong
                {"Eggplant"}, // Fried Eggplant
                {"Eggplant"}, // Boiled Eggplant
                {"Eggplant", "Tomato", "Onion"}, // Ensaladang Talong
                {"Eggplant", "Vinegar", "Soy Sauce", "Garlic"}, // Adobong Talong
            };

            String[] recipe = {
                // Egg Tomato Scramble
                "Step 1: Chop the tomato and onion.\nStep 2: Sauté them in oil until soft.\nStep 3: Beat the eggs with salt and pour them into the pan.\nStep 4: Stir until cooked. Serve with rice.\n",
                // Tortang Talong
                "Step 1: Grill or boil the eggplant until soft, then peel it. \nStep 2: Flatten the eggplant with a fork and dip it in beaten egg mixed with salt. \nStep 3: Fry in hot oil for 2 to 3 minutes per side until golden. \nStep 4: Serve with rice.\n",
                // Egg Rice
                "Step 1: Fry minced garlic in oil until light golden. \nStep 2: Add leftover rice and salt. \nStep 3: Stir for 3 to 4 minutes, then set aside. \nStep 4: Fry an egg and put it on top of the rice.",
                // Chicken Adobo
                "Step 1: Put the chicken, soy sauce, vinegar, crushed garlic, pepper, and bay leaf in a pot. \nStep 2: Bring to a boil. \nStep 3: Simmer covered for 25 to 30 minutes. \nStep 4: Simmer uncovered until the sauce thickens. Serve with rice.\n",
                // Pork Adobo
                "Step 1: Put the pork, soy sauce, vinegar, crushed garlic, pepper, and bay leaf in a pot. \nStep 2: Bring to a boil. \nStep 3: Simmer covered for 35 to 45 minutes until tender, adding a little water if it gets dry. \nStep 4: Serve with rice.\n",
                // Corned Beef
                "Step 1: Chop the garlic and onion. \nStep 2: Sauté them in oil until soft. \nStep 3: Add the corned beef and cook for 3 to 5 minutes, stirring. \nStep 4: Serve with rice.\n",
                // Sardines Meal
                "Step 1: Chop the garlic, onion, and tomato. \nStep 2: Sauté them in oil until soft. \nStep 3: Add the sardines with their sauce, mash lightly, and simmer for 3 to 5 minutes. \nStep 4: Serve with rice.\n",
                // HotSilog
                "Step 1: Slice the hotdogs and fry them in oil until browned. \nStep 2: Fry an egg in the same pan. \nStep 3: Fry the rice with garlic (optional). \nStep 4: Put everything on a plate and add ketchup.\n",
                // Luncheon Meat
                "Step 1: Slice the luncheon meat. \nStep 2: Fry the slices in oil until browned on both sides. \nStep 3: Fry an egg in the same pan. \nStep 4: Serve with rice (fried with garlic if you like).\n",
                // Pancit Canton
                "Step 1: Boil the noodles for 2 to 3 minutes. \nStep 2: Drain, leaving a little water, then mix in the seasoning. \nStep 3: Fry or boil an egg. \nStep 4: Put the egg on top and squeeze calamansi over it.\n",
                // Monggo
                "Step 1: Boil the mung beans for 25 to 30 minutes until soft. \nStep 2: Sauté garlic, onion, and tomato in oil. \nStep 3: Add the sautéed mix to the beans and season with salt. \nStep 4: Simmer for 5 to 10 minutes. Serve with rice.\n",
                // Tuyo
                "Step 1: Heat a little oil in a pan. \nStep 2: Fry the dried fish for 2 to 3 minutes per side until crisp. \nStep 3: Slice the tomato and prepare a vinegar dip. \nStep 4: Serve with rice.\n",
                // Cabbage Veggie Meal
                "Step 1: Slice the cabbage and chop the garlic and onion. \nStep 2: Sauté the garlic and onion in oil. \nStep 3: Add the cabbage and salt, then stir-fry for 4 to 5 minutes. \nStep 4: Serve with rice.\n",
                // Tinola
                "Step 1: Sauté ginger, garlic, and onion in oil. \nStep 2: Add the chicken and cook until lightly browned. \nStep 3: Add fish sauce and enough water to cover, then simmer for 25 to 30 minutes. \nStep 4: Season with salt. Serve hot.\n",
                // Sinigang
                "Step 1: Boil the pork in water for 30 to 40 minutes until tender.\nStep 2: Add the onion and tomato.\nStep 3: Stir in the sinigang mix and salt, then simmer for 5 minutes.\nStep 4: Serve hot with rice.\n",
                // Champorado
                "Step 1: Boil the rice in about 3 cups of water until soft. \nStep 2: Add the tablea and stir until melted. \nStep 3: Simmer until thick, then add sugar. \nStep 4: Pour milk on top. Serve warm.\n",
                // Scrambled Egg
                "Step 1: Beat the egg in a bowl. \nStep 2: Heat a little oil in a pan. \nStep 3: Pour in the egg and stir for 2 to 3 minutes until cooked. \nStep 4: Serve with rice if you have it.\n",
                // Boiled Egg
                "Step 1: Put the egg in a pot and cover it with water. \nStep 2: Bring to a boil, then lower the heat. \nStep 3: Cook for 7 to 10 minutes (shorter for soft, longer for hard). \nStep 4: Cool in cold water, peel, and eat.\n",
                // Sunny Side Up
                "Step 1: Heat a little oil in a pan over low to medium heat. \nStep 2: Crack the egg gently into the pan. \nStep 3: Cook for 2 to 3 minutes without flipping until the white is set and the yolk is still soft. \nStep 4: Serve with rice if you have it.\n",
                // Onion Omelet
                "Step 1: Chop the onion finely. \nStep 2: Beat the egg and mix in the onion. \nStep 3: Heat a little oil in a pan and pour in the mixture. \nStep 4: Cook for 2 to 3 minutes per side until golden.\n",
                // Egg Drop Soup
                "Step 1: Boil about 2 cups of water in a pot. \nStep 2: Add salt. \nStep 3: Beat the egg and slowly pour it into the boiling water while stirring gently. \nStep 4: Cook for 1 minute, then serve hot.\n",
                // Creamy Scrambled Egg
                "Step 1: Beat the egg with a splash of milk. \nStep 2: Heat a little oil in a pan over low heat. \nStep 3: Pour in the mixture and stir slowly for 2 to 3 minutes. \nStep 4: Take it off the heat while still slightly soft, since it keeps cooking.\n",
                // Egg Rice Bowl
                "Step 1: Cook rice and keep it hot. \nStep 2: Fry the egg in a little oil. \nStep 3: Put the egg on the rice and add a little soy sauce. \nStep 4: Mix the yolk into the rice and eat.\n",
                // Ketchup Egg Rice
                "Step 1: Scramble the egg in a little oil. \nStep 2: Add cooked rice and stir for 2 to 3 minutes. \nStep 3: Add ketchup and mix until evenly coated. \nStep 4: Serve hot.\n",
                // Adobong Itlog
                "Step 1: Boil the eggs for 8 to 10 minutes, then peel them. \nStep 2: Put the vinegar, soy sauce, and bay leaf in a pot with a little water and bring to a boil. \nStep 3: Add the eggs and simmer for 10 to 15 minutes until the sauce thickens. \nStep 4: Serve with rice.\n",
                // Plain Instant Noodles
                "Step 1: Boil water in a pot. \nStep 2: Add the noodles and cook for 2 to 3 minutes. \nStep 3: Add the seasoning and mix. \nStep 4: Serve hot.\n",
                // Crunchy Noodle Snack
                "Step 1: Keep the noodles dry and break the block into pieces. \nStep 2: Sprinkle the seasoning over the noodles. \nStep 3: Shake in a bag or bowl until coated. \nStep 4: Eat as a snack.\n",
                // Egg Noodle Soup
                "Step 1: Boil about 2 cups of water. \nStep 2: Add the noodles and cook for 2 minutes. \nStep 3: Crack in the egg and let it poach for 2 to 3 minutes. \nStep 4: Add the seasoning and serve hot.\n",
                // Corned Beef Noodles
                "Step 1: Boil the noodles for 2 to 3 minutes and drain, leaving a little water. \nStep 2: Heat the corned beef in a pan for 2 to 3 minutes. \nStep 3: Mix the noodles and the seasoning into the corned beef. \nStep 4: Serve hot.\n",
                // Sardines Noodles
                "Step 1: Boil the noodles for 2 to 3 minutes and drain, leaving a little water. \nStep 2: Heat the sardines with their sauce in a pan for 2 to 3 minutes. \nStep 3: Add the noodles and the seasoning and mix. \nStep 4: Serve hot.\n",
                // Hotdog Noodles
                "Step 1: Slice the hotdog and fry it until browned. \nStep 2: Boil the noodles for 2 to 3 minutes and drain, leaving a little water. \nStep 3: Mix in the seasoning and the hotdog. \nStep 4: Serve hot.\n",
                // Luncheon Meat Noodles
                "Step 1: Slice the luncheon meat and fry until browned on both sides. \nStep 2: Boil the noodles for 2 to 3 minutes and drain, leaving a little water. \nStep 3: Mix in the seasoning and put the luncheon meat on top. \nStep 4: Serve hot.\n",
                // Sinigang Noodles
                "Step 1: Boil about 2 cups of water. \nStep 2: Stir in the sinigang mix. \nStep 3: Add the noodles and cook for 2 to 3 minutes. \nStep 4: Add the noodle seasoning to taste and serve hot.\n",
                // Ginisang Kamatis
                "Step 1: Chop the tomato. \nStep 2: Heat a little oil in a pan. \nStep 3: Cook the tomato for 3 to 5 minutes until soft and saucy. \nStep 4: Serve with rice or fried fish.\n",
                // Roasted Tomato
                "Step 1: Cut the tomato in half. \nStep 2: Place it in a dry pan, cut side down. \nStep 3: Cook for 5 to 7 minutes until the skin is soft and slightly charred. \nStep 4: Serve with rice or fried fish.\n",
                // Tomato Onion Salad
                "Step 1: Slice the tomato and onion. \nStep 2: Mix them in a bowl. \nStep 3: Add salt or vinegar if you have it. \nStep 4: Serve cold with fried fish or rice.\n",
                // Tomato Soup
                "Step 1: Chop the tomato and garlic. \nStep 2: Sauté the garlic in a little oil, then add the tomato and cook until soft. \nStep 3: Add 2 cups of water and bring to a boil. \nStep 4: Season with salt and simmer for 5 minutes.\n",
                // Caramelized Onion
                "Step 1: Slice the onion thinly. \nStep 2: Heat a little oil in a pan on low heat. \nStep 3: Cook for 15 to 20 minutes, stirring, until soft and golden brown. \nStep 4: Serve with rice or fried food.\n",
                // Toasted Garlic
                "Step 1: Mince the garlic. \nStep 2: Fry it in a little oil over low heat. \nStep 3: Stir for 1 to 2 minutes until light golden. Do not let it burn. \nStep 4: Use as a topping for rice or noodles.\n",
                // Lugaw
                "Step 1: Boil the rice in about 4 cups of water. \nStep 2: Simmer for 25 to 30 minutes, stirring now and then, until thick. \nStep 3: Add salt if you have it. \nStep 4: Serve hot.\n",
                // Garlic Rice
                "Step 1: Mince the garlic. \nStep 2: Fry it in a little oil until light golden. \nStep 3: Add leftover rice and stir for 3 to 4 minutes. \nStep 4: Serve hot.\n",
                // Arroz Caldo
                "Step 1: Sauté ginger and garlic in a little oil. \nStep 2: Add the chicken and cook until lightly browned. \nStep 3: Add the rice and about 5 cups of water, then simmer for 25 to 30 minutes until thick and the chicken is cooked through. \nStep 4: Serve hot.\n",
                // Sweet Milk Rice
                "Step 1: Cook the rice until soft. \nStep 2: Pour in the milk and add sugar. \nStep 3: Simmer for 3 to 5 minutes, stirring. \nStep 4: Serve warm.\n",
                // Fish Sauce Fried Rice
                "Step 1: Fry minced garlic in a little oil until light golden. \nStep 2: Add leftover rice and stir for 3 to 4 minutes. \nStep 3: Add a splash of fish sauce and mix well. \nStep 4: Serve hot.\n",
                // Fried Chicken
                "Step 1: Cut the chicken into pieces and season with salt if you have it. \nStep 2: Heat enough oil in a pan. \nStep 3: Fry for 15 to 20 minutes, turning, until golden and cooked through. \nStep 4: Serve with rice.\n",
                // Nilagang Manok
                "Step 1: Put the chicken in a pot and cover it with water. \nStep 2: Bring to a boil, then simmer for 25 to 30 minutes until cooked through. \nStep 3: Skim off the foam. \nStep 4: Serve hot as a soup. Add salt if you have it.\n",
                // Pan-Grilled Chicken
                "Step 1: Heat a little oil in a pan over medium heat. \nStep 2: Cook the chicken covered for 8 to 10 minutes per side until cooked through. \nStep 3: Serve with rice.\n",
                // Garlic Pepper Chicken
                "Step 1: Crush the garlic and rub the chicken with it and the pepper. \nStep 2: Heat a little oil in a pan. \nStep 3: Cook the chicken for 15 to 20 minutes, turning, until golden and cooked through. \nStep 4: Serve with rice.\n",
                // Soy Garlic Chicken
                "Step 1: Marinate the chicken in soy sauce and crushed garlic for 15 minutes. \nStep 2: Heat a little oil in a pan and brown the chicken. \nStep 3: Add the leftover marinade and a little water, then simmer for 15 to 20 minutes until cooked through. \nStep 4: Serve with rice.\n",
                // Simple Tinola
                "Step 1: Slice the ginger and sauté it in a little oil. \nStep 2: Add the chicken and cook until lightly browned. \nStep 3: Add the fish sauce and about 3 cups of water. \nStep 4: Simmer for 25 to 30 minutes until the chicken is cooked through. Serve hot.\n",
                // Fried Pork
                "Step 1: Cut the pork into pieces and season with salt if you have it. \nStep 2: Heat enough oil in a pan. \nStep 3: Fry for 10 to 15 minutes, turning, until golden and cooked through. \nStep 4: Serve with rice.\n",
                // Nilagang Baboy
                "Step 1: Put the pork in a pot and cover it with water. \nStep 2: Bring to a boil, then simmer for 40 to 45 minutes until tender. \nStep 3: Skim off the foam. \nStep 4: Serve hot as a soup. Add salt if you have it.\n",
                // Pan-Grilled Pork
                "Step 1: Heat a little oil in a pan over medium heat. \nStep 2: Cook the pork for 5 to 7 minutes per side until browned and cooked through. \nStep 3: Serve with rice.\n",
                // Garlic Pepper Pork
                "Step 1: Crush the garlic and rub the pork with it and the pepper. \nStep 2: Heat a little oil in a pan. \nStep 3: Cook for 10 to 15 minutes, turning, until browned and cooked through. \nStep 4: Serve with rice.\n",
                // Soy Garlic Pork
                "Step 1: Marinate the pork in soy sauce and crushed garlic for 15 minutes. \nStep 2: Brown the pork in a little oil. \nStep 3: Add the leftover marinade and a little water, then simmer for 20 to 30 minutes until tender. \nStep 4: Serve with rice.\n",
                // Pork Cabbage Stir-fry
                "Step 1: Slice the pork thinly and chop the garlic and cabbage. \nStep 2: Sauté the garlic, then cook the pork for 8 to 10 minutes until browned and cooked through. \nStep 3: Add the cabbage and stir-fry for 4 to 5 minutes. \nStep 4: Serve with rice.\n",
                // Sinigang na Manok
                "Step 1: Boil the chicken in water for 25 to 30 minutes until cooked through. \nStep 2: Add the onion and tomato. \nStep 3: Stir in the sinigang mix, then simmer for 5 minutes. \nStep 4: Serve hot with rice.\n",
                // Sinigang na Gulay
                "Step 1: Boil about 4 cups of water with the onion and tomato. \nStep 2: Stir in the sinigang mix. \nStep 3: Add the sliced cabbage and simmer for 5 to 7 minutes. \nStep 4: Serve hot with rice.\n",
                // Toyo-Suka Dip
                "Step 1: Pour soy sauce and vinegar into a small bowl, about 1 part soy sauce to 1 part vinegar. \nStep 2: Mix well. \nStep 3: Taste and adjust. \nStep 4: Use as a dip for fried food.\n",
                // Sinamak
                "Step 1: Crush the garlic and pepper. \nStep 2: Put them in a small bowl or clean jar. \nStep 3: Pour in the vinegar. \nStep 4: Let it sit for at least 30 minutes, then use as a dip.\n",
                // Quick Pickled Onion
                "Step 1: Slice the onion thinly. \nStep 2: Mix the vinegar and sugar until the sugar dissolves. \nStep 3: Add the onion and let it sit for 20 to 30 minutes. \nStep 4: Serve as a side dish.\n",
                // Toyo-Mansi Dip
                "Step 1: Squeeze the calamansi into a small bowl. \nStep 2: Add the soy sauce. \nStep 3: Mix and taste. \nStep 4: Use as a dip for fried food.\n",
                // Patis-Calamansi Dip
                "Step 1: Squeeze the calamansi into a small bowl. \nStep 2: Add the fish sauce. \nStep 3: Mix and taste. \nStep 4: Use as a dip for fried or grilled food.\n",
                // Calamansi Juice
                "Step 1: Squeeze the calamansi into a glass. \nStep 2: Add cold water. \nStep 3: Stir well. \nStep 4: Add sugar if you have it.\n",
                // Adobong Hotdog
                "Step 1: Slice the hotdog. \nStep 2: Put the vinegar, soy sauce, and bay leaf in a pan with a little water and bring to a boil. \nStep 3: Add the hotdog and simmer for 8 to 10 minutes until the sauce thickens. \nStep 4: Serve with rice.\n",
                // Fried Hotdog
                "Step 1: Slice or score the hotdog. \nStep 2: Heat a little oil in a pan. \nStep 3: Fry for 3 to 5 minutes until browned. \nStep 4: Serve with rice.\n",
                // Boiled Hotdog
                "Step 1: Put the hotdog in a pot of water. \nStep 2: Bring to a boil and cook for 3 to 5 minutes. \nStep 3: Drain. \nStep 4: Serve with rice.\n",
                // Hotdog Egg Scramble
                "Step 1: Slice the hotdog and fry it until browned. \nStep 2: Beat the egg. \nStep 3: Pour the egg into the pan and stir until cooked. \nStep 4: Serve with rice.\n",
                // Hotdog Ketchup Rice
                "Step 1: Slice the hotdog and fry it until browned. \nStep 2: Add cooked rice and stir for 2 to 3 minutes. \nStep 3: Add ketchup and mix until coated. \nStep 4: Serve hot.\n",
                // Fried Luncheon Meat
                "Step 1: Slice the luncheon meat. \nStep 2: Heat a little oil in a pan. \nStep 3: Fry the slices for 2 to 3 minutes per side until browned. \nStep 4: Serve with rice.\n",
                // Crispy Luncheon Meat Cubes
                "Step 1: Cut the luncheon meat into small cubes. \nStep 2: Heat a little oil in a pan. \nStep 3: Fry for 5 to 7 minutes, turning, until crispy. \nStep 4: Serve with rice.\n",
                // Luncheon Meat Omelet
                "Step 1: Chop the luncheon meat into small pieces and fry briefly. \nStep 2: Beat the egg and pour it over the luncheon meat. \nStep 3: Cook for 2 to 3 minutes per side until golden. \nStep 4: Serve with rice.\n",
                // Crispy Corned Beef
                "Step 1: Heat a little oil in a pan. \nStep 2: Spread the corned beef flat in the pan. \nStep 3: Cook for 5 to 7 minutes, turning once, until crisp on the edges. \nStep 4: Serve with rice.\n",
                // Corned Beef and Egg
                "Step 1: Heat the corned beef in a pan for 3 to 5 minutes. \nStep 2: Beat the egg and pour it in. \nStep 3: Stir until the egg is cooked. \nStep 4: Serve with rice.\n",
                // Cornsilog
                "Step 1: Cook the corned beef in a pan for 3 to 5 minutes, stirring. \nStep 2: Fry an egg in a little oil. \nStep 3: Put the corned beef and the egg on the rice. \nStep 4: Serve hot.\n",
                // Corned Beef Cabbage
                "Step 1: Slice the cabbage. \nStep 2: Heat the corned beef in a pan for 3 minutes. \nStep 3: Add the cabbage and stir-fry for 4 to 5 minutes. \nStep 4: Serve with rice.\n",
                // Ginisang Sardinas
                "Step 1: Chop the garlic and onion. \nStep 2: Sauté them in a little oil until soft. \nStep 3: Add the sardines with their sauce and mash lightly. \nStep 4: Simmer for 3 to 5 minutes and serve with rice.\n",
                // Sardines Omelet
                "Step 1: Mash the sardines lightly. \nStep 2: Beat the egg and mix it with the sardines. \nStep 3: Pour into a hot, oiled pan. \nStep 4: Cook for 2 to 3 minutes per side until golden.\n",
                // Monggo Soup
                "Step 1: Boil the mung beans in about 4 cups of water for 25 to 30 minutes until soft. \nStep 2: Mash a few beans to thicken the soup. \nStep 3: Add salt if you have it. \nStep 4: Serve hot.\n",
                // Sweet Monggo
                "Step 1: Boil the mung beans for 25 to 30 minutes until soft. \nStep 2: Add sugar to taste. \nStep 3: Simmer for 5 minutes. \nStep 4: Serve warm.\n",
                // Monggo with Pork
                "Step 1: Boil the mung beans for 25 to 30 minutes until soft. \nStep 2: In another pan, sauté the garlic and onion, then cook the pork until browned and cooked through. \nStep 3: Add the pork mixture to the beans. \nStep 4: Simmer for 10 minutes. Serve with rice.\n",
                // Monggo with Tuyo
                "Step 1: Boil the mung beans for 25 to 30 minutes until soft. \nStep 2: Sauté the garlic in a little oil and add it to the beans. \nStep 3: Fry the dried fish until crisp, flake it, and add it to the beans. \nStep 4: Simmer for 5 minutes and serve with rice.\n",
                // Fried Dried Fish
                "Step 1: Heat a little oil in a pan. \nStep 2: Fry the dried fish for 2 to 3 minutes per side until crisp. \nStep 3: Drain on a paper towel. \nStep 4: Serve with rice.\n",
                // Grilled Dried Fish
                "Step 1: Heat a dry pan or a grill. \nStep 2: Cook the dried fish for 2 to 3 minutes per side until lightly charred. \nStep 3: Remove any bones if you like. \nStep 4: Serve with rice.\n",
                // Tuyo with Vinegar
                "Step 1: Fry the dried fish for 2 to 3 minutes per side until crisp. \nStep 2: Pour a little vinegar into a small bowl. \nStep 3: Dip the fish in the vinegar. \nStep 4: Serve with rice.\n",
                // Tuyo Garlic Rice
                "Step 1: Fry the dried fish until crisp, then flake it and remove the bones. \nStep 2: Fry minced garlic in a little oil until light golden. \nStep 3: Add the rice and the fish flakes and stir for 3 to 4 minutes. \nStep 4: Serve hot.\n",
                // Boiled Cabbage
                "Step 1: Slice the cabbage. \nStep 2: Boil in 2 cups of water for 5 to 7 minutes. \nStep 3: Add salt if you have it. \nStep 4: Serve hot as a side dish or soup.\n",
                // Stir-fried Cabbage
                "Step 1: Slice the cabbage. \nStep 2: Heat a little oil in a pan. \nStep 3: Stir-fry for 4 to 5 minutes. \nStep 4: Serve with rice.\n",
                // Cabbage Salad
                "Step 1: Slice the cabbage very thinly. \nStep 2: Rinse and drain it well. \nStep 3: Add a splash of vinegar or calamansi if you have it. \nStep 4: Serve cold as a side dish.\n",
                // Cabbage Egg Stir-fry
                "Step 1: Slice the cabbage. \nStep 2: Stir-fry it in a little oil for 4 to 5 minutes. \nStep 3: Push the cabbage to the side, add the beaten egg, and scramble. \nStep 4: Mix together and serve with rice.\n",
                // Cabbage with Fish Sauce
                "Step 1: Slice the cabbage and chop the garlic. \nStep 2: Sauté the garlic in a little oil. \nStep 3: Add the cabbage and a splash of fish sauce, then stir-fry for 4 to 5 minutes. \nStep 4: Serve with rice.\n",
                // Ginger Tea
                "Step 1: Slice the ginger. \nStep 2: Boil it in 2 cups of water for 10 minutes. \nStep 3: Strain. \nStep 4: Serve hot.\n",
                // Salabat
                "Step 1: Slice the ginger and crush it lightly. \nStep 2: Boil it in 2 cups of water for 10 minutes. \nStep 3: Add sugar to taste. \nStep 4: Strain and serve hot.\n",
                // Warm Milk
                "Step 1: Pour the milk into a pot. \nStep 2: Heat on low until warm. Do not let it boil. \nStep 3: Pour into a cup. \nStep 4: Serve warm.\n",
                // Sikwate
                "Step 1: Boil 2 cups of water. \nStep 2: Add the tablea and stir until melted. \nStep 3: Whisk until smooth. \nStep 4: Serve hot. Add sugar if you have it.\n",
                // Tablea Hot Chocolate
                "Step 1: Heat the milk in a pot on low heat. \nStep 2: Add the tablea and stir until melted. \nStep 3: Add sugar to taste. \nStep 4: Serve hot. Do not let it boil.\n",
                // Simple Champorado
                "Step 1: Boil the rice in about 3 cups of water until soft. \nStep 2: Add the tablea and stir until melted. \nStep 3: Add sugar to taste and simmer until thick. \nStep 4: Serve warm.\n",
                // Inihaw na Talong
                "Step 1: Poke the eggplant with a fork. \nStep 2: Grill it over a flame or roast it in a dry pan, turning, for 10 to 15 minutes until soft. \nStep 3: Peel off the skin. \nStep 4: Serve with rice.\n",
                // Fried Eggplant
                "Step 1: Slice the eggplant. \nStep 2: Heat a little oil in a pan. \nStep 3: Fry for 2 to 3 minutes per side until golden. \nStep 4: Serve with rice. Add salt if you have it.\n",
                // Boiled Eggplant
                "Step 1: Boil the whole eggplant in water for 10 to 15 minutes until soft. \nStep 2: Drain and let it cool a little. \nStep 3: Peel off the skin. \nStep 4: Serve with rice.\n",
                // Ensaladang Talong
                "Step 1: Grill or roast the eggplant until soft, then peel it. \nStep 2: Chop the tomato and onion. \nStep 3: Slice the eggplant and mix it with the tomato and onion. \nStep 4: Serve with rice or fried fish.\n",
                // Adobong Talong
                "Step 1: Slice the eggplant and fry it until lightly browned. \nStep 2: Add crushed garlic, soy sauce, vinegar, and a little water. \nStep 3: Simmer for 8 to 10 minutes. \nStep 4: Serve with rice.\n"
            };

            String[] sources = { // sources
                "Traditional Filipino home cooking", // Egg Tomato Scramble
                "Traditional Filipino home cooking", // Tortang Talong
                "Traditional Filipino home cooking", // Egg Rice
                "Traditional Filipino home cooking", // Chicken Adobo
                "Traditional Filipino home cooking", // Pork Adobo
                "Traditional Filipino home cooking", // Corned Beef
                "Traditional Filipino home cooking", // Sardines Meal
                "Traditional Filipino home cooking", // HotSilog
                "Traditional Filipino home cooking", // Luncheon Meat
                "Traditional Filipino home cooking", // Pancit Canton
                "Traditional Filipino home cooking", // Monggo
                "Traditional Filipino home cooking", // Tuyo
                "Traditional Filipino home cooking", // Cabbage Veggie Meal
                "Traditional Filipino home cooking", // Tinola
                "Traditional Filipino home cooking", // Sinigang
                "Traditional Filipino home cooking", // Champorado
                "Traditional Filipino home cooking", // Scrambled Egg
                "Traditional Filipino home cooking", // Boiled Egg
                "Traditional Filipino home cooking", // Sunny Side Up
                "Traditional Filipino home cooking", // Onion Omelet
                "Traditional Filipino home cooking", // Egg Drop Soup
                "Traditional Filipino home cooking", // Creamy Scrambled Egg
                "Traditional Filipino home cooking", // Egg Rice Bowl
                "Traditional Filipino home cooking", // Ketchup Egg Rice
                "Traditional Filipino home cooking", // Adobong Itlog
                "Traditional Filipino home cooking", // Plain Instant Noodles
                "Traditional Filipino home cooking", // Crunchy Noodle Snack
                "Traditional Filipino home cooking", // Egg Noodle Soup
                "Traditional Filipino home cooking", // Corned Beef Noodles
                "Traditional Filipino home cooking", // Sardines Noodles
                "Traditional Filipino home cooking", // Hotdog Noodles
                "Traditional Filipino home cooking", // Luncheon Meat Noodles
                "Traditional Filipino home cooking", // Sinigang Noodles
                "Traditional Filipino home cooking", // Ginisang Kamatis
                "Traditional Filipino home cooking", // Roasted Tomato
                "Traditional Filipino home cooking", // Tomato Onion Salad
                "Traditional Filipino home cooking", // Tomato Soup
                "Traditional Filipino home cooking", // Caramelized Onion
                "Traditional Filipino home cooking", // Toasted Garlic
                "Traditional Filipino home cooking", // Lugaw
                "Traditional Filipino home cooking", // Garlic Rice
                "Traditional Filipino home cooking", // Arroz Caldo
                "Traditional Filipino home cooking", // Sweet Milk Rice
                "Traditional Filipino home cooking", // Fish Sauce Fried Rice
                "Traditional Filipino home cooking", // Fried Chicken
                "Traditional Filipino home cooking", // Nilagang Manok
                "Traditional Filipino home cooking", // Pan-Grilled Chicken
                "Traditional Filipino home cooking", // Garlic Pepper Chicken
                "Traditional Filipino home cooking", // Soy Garlic Chicken
                "Traditional Filipino home cooking", // Simple Tinola
                "Traditional Filipino home cooking", // Fried Pork
                "Traditional Filipino home cooking", // Nilagang Baboy
                "Traditional Filipino home cooking", // Pan-Grilled Pork
                "Traditional Filipino home cooking", // Garlic Pepper Pork
                "Traditional Filipino home cooking", // Soy Garlic Pork
                "Traditional Filipino home cooking", // Pork Cabbage Stir-fry
                "Traditional Filipino home cooking", // Sinigang na Manok
                "Traditional Filipino home cooking", // Sinigang na Gulay
                "Traditional Filipino home cooking", // Toyo-Suka Dip
                "Traditional Filipino home cooking", // Sinamak
                "Traditional Filipino home cooking", // Quick Pickled Onion
                "Traditional Filipino home cooking", // Toyo-Mansi Dip
                "Traditional Filipino home cooking", // Patis-Calamansi Dip
                "Traditional Filipino home cooking", // Calamansi Juice
                "Traditional Filipino home cooking", // Adobong Hotdog
                "Traditional Filipino home cooking", // Fried Hotdog
                "Traditional Filipino home cooking", // Boiled Hotdog
                "Traditional Filipino home cooking", // Hotdog Egg Scramble
                "Traditional Filipino home cooking", // Hotdog Ketchup Rice
                "Traditional Filipino home cooking", // Fried Luncheon Meat
                "Traditional Filipino home cooking", // Crispy Luncheon Meat Cubes
                "Traditional Filipino home cooking", // Luncheon Meat Omelet
                "Traditional Filipino home cooking", // Crispy Corned Beef
                "Traditional Filipino home cooking", // Corned Beef and Egg
                "Traditional Filipino home cooking", // Cornsilog
                "Traditional Filipino home cooking", // Corned Beef Cabbage
                "Traditional Filipino home cooking", // Ginisang Sardinas
                "Traditional Filipino home cooking", // Sardines Omelet
                "Traditional Filipino home cooking", // Monggo Soup
                "Traditional Filipino home cooking", // Sweet Monggo
                "Traditional Filipino home cooking", // Monggo with Pork
                "Traditional Filipino home cooking", // Monggo with Tuyo
                "Traditional Filipino home cooking", // Fried Dried Fish
                "Traditional Filipino home cooking", // Grilled Dried Fish
                "Traditional Filipino home cooking", // Tuyo with Vinegar
                "Traditional Filipino home cooking", // Tuyo Garlic Rice
                "Traditional Filipino home cooking", // Boiled Cabbage
                "Traditional Filipino home cooking", // Stir-fried Cabbage
                "Traditional Filipino home cooking", // Cabbage Salad
                "Traditional Filipino home cooking", // Cabbage Egg Stir-fry
                "Traditional Filipino home cooking", // Cabbage with Fish Sauce
                "Traditional Filipino home cooking", // Ginger Tea
                "Traditional Filipino home cooking", // Salabat
                "Traditional Filipino home cooking", // Warm Milk
                "Traditional Filipino home cooking", // Sikwate
                "Traditional Filipino home cooking", // Tablea Hot Chocolate
                "Traditional Filipino home cooking", // Simple Champorado
                "Traditional Filipino home cooking", // Inihaw na Talong
                "Traditional Filipino home cooking", // Fried Eggplant
                "Traditional Filipino home cooking", // Boiled Eggplant
                "Traditional Filipino home cooking", // Ensaladang Talong
                "Traditional Filipino home cooking" // Adobong Talong
            };

            System.out.println("Welcome to Our Meal Suggestion System!");
            System.out.println("Created by: Group 1");
            System.out.println("");
            System.out.println("Created Using:");
            System.out.println("Programming Language: Java");
            System.out.println("IDE: Visual Studio Code");
            System.out.println("Service Used: GitHub");
            System.out.println("Contributors: Gile, Jeorge, Jude,  Adrian, and Vargas");
            System.out.println("Created for boarding house students to help them with their meal suggestions based on the ingredients they have.");

            while (menu) { // Start of "menu" loop
                System.out.println("");
                System.out.println("Would you like to proceed? (yes/no)");
                String proceed = input.nextLine(); // Store the user's response in "proceed"

                if (proceed.equalsIgnoreCase("yes")) { // If the user wants to proceed, set menu to false to exit the loop
                    menu = false;
                } else if (proceed.equalsIgnoreCase("no")) { // If the user doesn't want to proceed, print a thank you message and exit the program
                    System.out.println("Thank you for visiting our app! Have a great day!");
                    return; // Exit the program
                } else {
                    System.out.println("Invalid input! Please enter 'yes' or 'no'."); // Prompt the user again if the input is invalid
                }
            } // End of "menu" loop

            while (program) { // Start of "program" loop
                System.out.println("");
                System.out.println("Please pick your ingredient:");

                String[] userIngredients = new String[500]; // Array to store the ingredients selected by the user
                int count = 0; // Counter for userIngredients for indexing values
                foundany = false; // Reset every round so the "no dishes match" message works on later tries

                for (int i = 0; i < ingredients.length; i++) { // Prints out the ingredients from the array
                    System.out.println(i + ". " + ingredients[i]);
                }

                int choice = 0;
                while (true) {
                    System.out.print("Pick a number (-1 to finish): "); // Input -1 to exit the loop

                    if (input.hasNextInt()) { // Check if the input is an integer
                        choice = input.nextInt(); // Read the integer input
                        input.nextLine(); // Consume the newline character left by nextInt()
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        input.next(); // Clears the invalid input from the scanner buffer
                        continue; // Prompt the user again
                    }

                    if (choice == -1) { // If statement for checking if the user input is -1 to exit the loop and for checking if the user picked at least one ingredient
                        if (count == 0) { // If startement for checking if the user picked at least one ingredient
                            System.out.println("You did not pick any ingredient! Please pick at least one.");
                            continue; // returns to the beginning of the loop to prompt the user again
                        }
                        break; // breaks out of the loop if the user picked at least one ingredient
                    }

                    if (count == userIngredients.length) { // array is full
                        System.out.println("You have reached the maximum number of ingredients.");
                        break;
                    }

                    if (choice >= 0 && choice < ingredients.length) { // If statement for checking if "choice" less than the length of the ingredients array and greater than or equal to 0 / Loop 1

                        boolean alreadyPicked = false;

                        for (int c = 0; c < count; c++) { // Loop through the ingredients the user already picked
                            if (ingredients[choice].equals(userIngredients[c])) { // Check if this ingredient was already picked
                                alreadyPicked = true;
                                break;
                            }
                        }

                        if (alreadyPicked) {
                            System.out.println(ingredients[choice] + " is already picked!"); // di na i add kasi na picked na/ won't add 
                        } else {
                            userIngredients[count] = ingredients[choice]; // Store selected ingredient to the "userIngredients" Array
                            count++; // moves the next user input to the next index of the "userIngredients" Array

                            System.out.println("Ingredient added: " + "" + ingredients[choice]); // Prints out the selected ingredient to the user
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }

                int[] matchCount = new int[dishes.length]; // How many of each dish's ingredients the user has
                boolean[][] have = new boolean[dishes.length][]; // have[i][j] is true if the user has ingredient j of dish i

                for (int i = 0; i < availableIngredients.length; i++) { // Loop through each dish's available ingredients / Loop 1

                    have[i] = new boolean[availableIngredients[i].length];

                    for (int j = 0; j < availableIngredients[i].length; j++) { // Loop through each ingredient of the current dish in the 2d array / Loop 2

                        for (int c = 0; c < count; c++) { // Loop through the user's selected ingredients / Loop 3
                            if (availableIngredients[i][j].equals(userIngredients[c])) { // Check if the user input matches the current dish's ingredient
                                have[i][j] = true; // The user has this ingredient
                                matchCount[i]++; // One more ingredient matched for this dish
                                break;
                            }
                        } // End of Loop 3
                    } // End of Loop 2
                } // End of Loop 1

                for (int i = 0; i < availableIngredients.length; i++) { // Full matches: the user has every ingredient of the dish

                    if (matchCount[i] == availableIngredients[i].length) {
                        foundany = true; // We found a dish, so change it to true

                        String needed = ""; // Builds the list of ingredients the dish needs
                        for (int j = 0; j < availableIngredients[i].length; j++) {
                            if (j > 0) {
                                needed = needed + ", ";
                            }
                            needed = needed + availableIngredients[i][j];
                        }

                        System.out.println();
                        System.out.println("You can make: " + dishes[i]); // Print the name of the dish
                        System.out.println("Ingredients needed: " + needed);
                        System.out.println("Recipe: " + recipe[i]); // Print the recipe for the dish
                        System.out.println("Source: " + sources[i]);
                        System.out.println();
                    }
                }

                boolean founded = false;
                int maximum = 5; // The most "could make" dishes to print, change this number to show more or less
                int shown = 0; // How many "could make" dishes were printed so far

                for (int m = 1; m <= ingredients.length; m++) { // m = number of missing ingredients, so the dishes closest to done are printed first

                    for (int i = 0; i < availableIngredients.length; i++) { // Partial matches: the user has some (but not all) of the ingredients of the dish

                        int missing = availableIngredients[i].length - matchCount[i];

                        if (matchCount[i] > 0 && missing == m && shown < maximum) {
                            if (!founded) { // Prints the header only once
                                System.out.println();
                                if (foundany) {
                                    System.out.println("You could also make these if you add more ingredients:");
                                } else {
                                    System.out.println("You can't make a full dish yet, but you could make these if you add more ingredients:");
                                }
                                founded = true;
                            }

                            String missingList = ""; // Builds the list of ingredients the user doesn't have yet
                            for (int j = 0; j < availableIngredients[i].length; j++) {
                                if (!have[i][j]) {
                                    if (!missingList.equals("")) {
                                        missingList = missingList + ", ";
                                    }
                                    missingList = missingList + availableIngredients[i][j];
                                }
                            }

                            System.out.println();
                            System.out.println("Could make: " + dishes[i]);
                            System.out.println("You have " + matchCount[i] + " of " + availableIngredients[i].length + " ingredients");
                            System.out.println("Missing: " + missingList);
                            shown++;
                        }
                    }
                }

                if (!foundany && !founded) { // if statement for checking if it's still false after checking all dishes, nothing matched
                    System.out.println("Sorry, no dishes match your ingredients. Try picking more!"); // Prints out this if the user input is
                }

                int[] unlockCount = new int[ingredients.length]; // How many dishes each ingredient would complete if the user added it

                for (int i = 0; i < availableIngredients.length; i++) { // Only dishes missing exactly 1 ingredient

                    if (availableIngredients[i].length - matchCount[i] == 1) {
                        for (int j = 0; j < availableIngredients[i].length; j++) {
                            if (!have[i][j]) { // This is the one missing ingredient
                                for (int k = 0; k < ingredients.length; k++) { // Find it in the ingredients array
                                    if (ingredients[k].equals(availableIngredients[i][j])) {
                                        unlockCount[k]++;
                                    }
                                }
                            }
                        }
                    }
                }

                int best = 0; // Index of the ingredient that unlocks the most dishes
                for (int k = 1; k < ingredients.length; k++) {
                    if (unlockCount[k] > unlockCount[best]) {
                        best = k;
                    }
                }

                if (unlockCount[best] > 0) {
                    System.out.println();
                    System.out.println("Tip: Add " + ingredients[best] + " to unlock " + unlockCount[best] + " more dishes!");
                }

                while (retry) { // Start of "retry" loop
                    System.out.println("--------------------------------------------------");
                    System.out.println("Would you like to try again? (yes/no)"); // Ask the user if they want to try again
                    String tryAgain = input.nextLine(); // Store the user's response in "tryAgain"

                    if (tryAgain.equalsIgnoreCase("yes")) {
                        break;
                    } else if (tryAgain.equalsIgnoreCase("no")) {
                        System.out.println();
                        System.out.println("Thank You For Using Our System! ");
                        System.out.println("Have A Great Day! ");
                        retry = false; // Set retry to false to exit the loop
                        program = false; // Set program to false to exit the outer loop
                    } else {
                        System.out.println();
                        System.out.println("Pls Pick From Yes/No Only");
                        System.out.println();
                    }
                } // End of while "retry" loop
            } // End of "program" loop
        } // End of Scanner
    }
}

// Nalilito ako huhuhuhuhuh shit raming index

/*
 MATCHING LOOPS (1, 2, 3)
  Loop 1: for (int i = 0; i < availableIngredients.length; i++)
    - Goes through each dish, one by one (each row of the 2D array).
    - i is also the index for dishes[i], recipe[i] and sources[i].

  Loop 2: for (int j = 0; j < availableIngredients[i].length; j++)
    - Goes through each ingredient that the current dish needs.
    - availableIngredients[i][j] = one needed ingredient.

  Loop 3: for (int c = 0; c < count; c++)
    - Goes through the ingredients the user picked, userIngredients[c].
    - Checks if the needed ingredient matches one of them using .equals().
    - If it matches: have[i][j] = true, matchCount[i]++, then break (stop searching).

  After the 3 loops:
    - matchCount[i] == availableIngredients[i].length: the user has everything, print the dish,
      the ingredients needed, the recipe and the source (full match).
    - Any dish with at least 1 matched ingredient but not all: print it as "Could make" with how many
      ingredients the user has and the missing ones, using have[i][j] to know which ones are missing.
      The m loop prints the dishes with the fewest missing ingredients first, and maximum
      is the most of these that get printed (full matches are always all printed).
    - if (!foundany && !founded): prints only if nothing matched at all
    - Exactly 1 ingredient missing: unlockCount[k]++ for that ingredient, then the ingredient
      with the highest unlockCount[k] is the "Tip".

  Order of movement:
    c is the fastest (finishes a full lap of the user's list first),
    j is slower, i is the slowest.

    shit ang sakit sa ulo mag track ng index sa 2d array hahah
    sana maintindhan nyo kasi sakit sa ulo talaga mag track ahhhahaha
 */
