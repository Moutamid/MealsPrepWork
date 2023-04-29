package com.moutamid.mealsprepwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.moutamid.mealsprepwork.database.RoomDB;
import com.moutamid.mealsprepwork.databinding.ActivityMainBinding;
import com.moutamid.mealsprepwork.models.MealModel;
import com.moutamid.mealsprepwork.utlis.Constants;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ProgressDialog progressDialog;
    RoomDB database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Constants.checkApp(this);

        database = RoomDB.getInstance(this);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Adding into Database");
        progressDialog.setCancelable(false);

        binding.add.setOnClickListener(v -> {
            List<MealModel> list = database.mealDAO().getAll();
            if (list.size()>0){
                Toast.makeText(this, "Meals Already Added " + list.size(), Toast.LENGTH_SHORT).show();
            } else {
                progressDialog.show();
                addMeals();
            }
        });

        binding.save.setOnClickListener(v -> {
            startActivity(new Intent(this, SavedActivity.class));
            finish();
        });

        binding.localSearch.setOnClickListener(v -> {
            startActivity(new Intent(this, SearchIngredientActivity.class));
            finish();
        });

        binding.apiSearch.setOnClickListener(v -> {
            startActivity(new Intent(this, SearchActivity.class));
            finish();
        });

    }

    private void addMeals() {
        // Meal 1 ------------------------------------------
        {
            MealModel model1 = new MealModel();
            model1.setMeal("Sweet and Sour Pork");
            model1.setDrinkAlternate(null);
            model1.setCategory("Pork");
            model1.setArea("Chinese");
            model1.setInstructions("Preparation\r\n1. Crack the egg into a bowl. Separate the egg white and yolk." +
                    "\r\n\r\nSweet and Sour Pork\r\n2. Slice the pork tenderloin into ips.\r\n\r\n" +
                    "3. Prepare the marinade using a pinch of salt, one teaspoon of starch, two teaspoons of light soy sauce, and an egg white.\r\n\r\n" +
                    "4. Marinade the pork ips for about 20 minutes.\r\n\r\n5. Put the remaining starch in a bowl. Add some water and vinegar to make a starchy sauce." +
                    "\r\n\r\nSweet and Sour Pork\r\nCooking Inuctions\r\n1. Pour the cooking oil into a wok and heat to 190\u00b0C (375\u00b0F). " +
                    "Add the marinated pork ips and fry them until they turn brown. Remove the cooked pork from the wok and place on a plate.\r\n\r\n" +
                    "2. Leave some oil in the wok. Put the tomato sauce and white sugar into the wok, and heat until the oil and sauce are fully combined." +
                    "\r\n\r\n3. Add some water to the wok and thoroughly heat the sweet and sour sauce before adding the pork ips to it." +
                    "\r\n\r\n4. Pour in the starchy sauce. Stir-fry all the ingredients until the pork and sauce are thoroughly mixed together." +
                    "\r\n\r\n5. Serve on a plate and add some coriander for decoration.");
            model1.setMealThumb("https://www.themealdb.com/images/media/meals/1529442316.jpg");
            model1.setTags("Sweet");
            model1.setYoutube("https://www.youtube.com/watch?v=mdaBIhgEAMo");
            model1.setIngredient1("Pork");
            model1.setIngredient2("Egg");
            model1.setIngredient3("Water");
            model1.setIngredient4("Salt");
            model1.setIngredient5("Sugar");
            model1.setIngredient6("Soy Sauce");
            model1.setIngredient7("Starch");
            model1.setIngredient8("Tomato Puree");
            model1.setIngredient9("Vinegar");
            model1.setIngredient10("Coriander");
            model1.setMeasure1("200g");
            model1.setMeasure2("1");
            model1.setMeasure3("Dash");
            model1.setMeasure4("1/2 tsp");
            model1.setMeasure5("1 tsp");
            model1.setMeasure6("10g");
            model1.setMeasure7("10g");
            model1.setMeasure8("30g");
            model1.setMeasure9("10g");
            model1.setMeasure10("Dash");

            database.mealDAO().insert(model1);
        }

        // Meal 2 ------------------------------------------
        {
            MealModel model2 = new MealModel();
            model2.setMeal("Chicken Marengo");
            model2.setDrinkAlternate(null);
            model2.setCategory("Chicken");
            model2.setArea("French");
            model2.setInstructions("Heat the oil in a large flameproof casserole dish and stir-fry the mushrooms until they start to soften. Add the chicken legs and cook briefly on each side to colour them a little." +
                    "\r\nPour in the passata, crumble in the stock cube and stir in the olives. Season with black pepper \u2013 you shouldn\u2019t need salt." +
                    " Cover and simmer for 40 mins until the chicken is tender. Sprinkle with parsley and serve with pasta and a salad, or mash and green veg, if you like.");
            model2.setMealThumb("https://www.themealdb.com/images/media/meals/qpxvuq1511798906.jpg");
            model2.setTags(null);
            model2.setYoutube("https://www.youtube.com/watch?v=U33HYUr-0Fw");
            model2.setIngredient1("Olive Oil");
            model2.setIngredient2("Mushrooms");
            model2.setIngredient3("Chicken Legs");
            model2.setIngredient4("Passata");
            model2.setIngredient5("Chicken Stock Cube");
            model2.setIngredient6("Black Olives");
            model2.setIngredient7("Parsley");
            model2.setMeasure1("1 tbs");
            model2.setMeasure2("300g");
            model2.setMeasure3("4");
            model2.setMeasure4("500g");
            model2.setMeasure5("1");
            model2.setMeasure6("100g");
            model2.setMeasure7("Chopped");
            model2.setSource("https://www.bbcgoodfood.com/recipes/3146682/chicken-marengo");
            model2.setImageSource(null);
            model2.setCreativeCommonsConfirmed(null);
            model2.setDateModified(null);

            database.mealDAO().insert(model2);
        }

        // Meal 3 ------------------------------------------
        {
            MealModel model3 = new MealModel();
            model3.setMeal("Beef Banh Mi Bowls with Sriracha Mayo, Carrot & Pickled Cucumber");
            model3.setDrinkAlternate(null);
            model3.setCategory("Beef");
            model3.setArea("Vietnamese");
            model3.setInstructions("Add'l ingredients: mayonnaise, siracha\r\n\r\n1\r\n\r\nPlace rice in a fine-mesh sieve and rinse until water runs clear." +
                    " Add to a small pot with 1 cup water (2 cups for 4 servings) and a pinch of salt." +
                    " Bring to a boil, then cover and reduce heat to low. Cook until rice is tender, 15 minutes. Keep covered off heat for at least 10 minutes or until ready to serve." +
                    "\r\n\r\n2\r\n\r\nMeanwhile, wash and dry all produce. Peel and finely chop garlic. Zest and quarter lime (for 4 servings, zest 1 lime and quarter both)." +
                    " Trim and halve cucumber lengthwise; thinly slice crosswise into half-moons. Halve, peel, and medium dice onion. Trim, peel, and grate carrot." +
                    "\r\n\r\n3\r\n\r\nIn a medium bowl, combine cucumber, juice from half the lime," +
                    " \u00bc tsp sugar (\u00bd tsp for 4 servings), and a pinch of salt. In a small bowl, " +
                    "combine mayonnaise, a pinch of garlic, a squeeze of lime juice, and as much sriracha as you\u2019d like. Season with salt and pepper." +
                    "\r\n\r\n4\r\n\r\nHeat a drizzle of oil in a large pan over medium-high heat." +
                    " Add onion and cook, stirring, until softened, 4-5 minutes. Add beef, remaining garlic, and 2 tsp sugar (4 tsp for 4 servings). Cook, breaking" +
                    " up meat into pieces, until beef is browned and cooked through, 4-5 minutes. Stir in soy sauce. Turn off heat; taste and season with salt and pepper." +
                    "\r\n\r\n5\r\n\r\nFluff rice with a fork; stir in lime zest and 1 TBSP butter. Divide rice between bowls." +
                    " Arrange beef, grated carrot, and pickled cucumber on top. Top with a squeeze of lime juice. Drizzle with sriracha mayo.");
            model3.setMealThumb("https://www.themealdb.com/images/media/meals/z0ageb1583189517.jpg");
            model3.setTags(null);
            model3.setYoutube("");
            model3.setIngredient1("Rice");
            model3.setIngredient2("Onion");
            model3.setIngredient3("Lime");
            model3.setIngredient4("Garlic Clove");
            model3.setIngredient5("Cucumber");
            model3.setIngredient6("Carrots");
            model3.setIngredient7("Ground Beef");
            model3.setIngredient8("Soy Sauce");
            model3.setMeasure1("White");
            model3.setMeasure2("1");
            model3.setMeasure3("1");
            model3.setMeasure4("3");
            model3.setMeasure5("1");
            model3.setMeasure6("3 oz");
            model3.setMeasure7("1 lb");
            model3.setMeasure8("2 oz");
            model3.setSource("");
            model3.setImageSource(null);
            model3.setCreativeCommonsConfirmed(null);
            model3.setDateModified(null);

            database.mealDAO().insert(model3);
        }

        // Meal 4 ------------------------------------------
        {
            MealModel model4 = new MealModel();
            model4.setMeal("Leblebi Soup");
            model4.setDrinkAlternate(null);
            model4.setCategory("Vegetarian");
            model4.setArea("Tunisian");
            model4.setInstructions("Heat the oil in a large pot. Add the onion and cook until translucent." +
                    "\r\nDrain the soaked chickpeas and add them to the pot together with the vegetable stock." +
                    " Bring to the boil, then reduce the heat and cover. Simmer for 30 minutes." +
                    "\r\nIn the meantime toast the cumin in a small ungreased frying pan, then grind them in a mortar." +
                    " Add the garlic and salt and pound to a fine paste.\r\nAdd the paste and the harissa to the soup and simmer until" +
                    " the chickpeas are tender, about 30 minutes.\r\nSeason to taste with salt, pepper and lemon juice and serve hot.");
            model4.setMealThumb("https://www.themealdb.com/images/media/meals/x2fw9e1560460636.jpg");
            model4.setTags("Soup");
            model4.setYoutube("https://www.youtube.com/watch?v=BgRifcCwinY");
            model4.setIngredient1("Olive Oil");
            model4.setIngredient2("Onion");
            model4.setIngredient3("Chickpeas");
            model4.setIngredient4("Vegetable Stock");
            model4.setIngredient5("Cumin");
            model4.setIngredient6("Garlic");
            model4.setIngredient7("Salt");
            model4.setIngredient8("Harissa Spice");
            model4.setIngredient9("Pepper");
            model4.setIngredient10("Lime");
            model4.setMeasure1("2 tbs");
            model4.setMeasure2("1 medium finely diced");
            model4.setMeasure3("250g");
            model4.setMeasure4("1.5L");
            model4.setMeasure5("1 tsp");
            model4.setMeasure6("5 cloves");
            model4.setMeasure7("1/2 tsp");
            model4.setMeasure8("1 tsp");
            model4.setMeasure9("Pinch");
            model4.setMeasure10("1/2");
            model4.setSource("http://allrecipes.co.uk/recipe/43419/leblebi--tunisian-chickpea-soup-.aspx");
            model4.setImageSource(null);
            model4.setCreativeCommonsConfirmed(null);
            model4.setDateModified(null);

            database.mealDAO().insert(model4);
        }

        // Meal 5 ------------------------------------------
        {
            MealModel model5 = new MealModel();
            model5.setMeal("Spicy Arrabiata Penne");
            model5.setDrinkAlternate(null);
            model5.setCategory("Vegetarian");
            model5.setArea("Italian");
            model5.setInstructions("Bring a large pot of water to a boil. Add kosher " +
                    "salt to the boiling water, then add the pasta. Cook according to the " +
                    "package instructions, about 9 minutes.");
            // TODO Add image
            model5.setMealThumb("");
            model5.setTags("Pasta,Curry");
            model5.setYoutube("https://www.youtube.com/watch?v=1IszT_guI08");
            model5.setIngredient1("penne rigate");
            model5.setIngredient2("olive oil");
            model5.setIngredient3("garlic");
            model5.setIngredient4("chopped tomatoes");
            model5.setIngredient5("red chile flakes");

            database.mealDAO().insert(model5);
        }

        // Meal 6 ------------------------------------------
        {
            MealModel model6 = new MealModel();
            model6.setMeal("Brown Stew Chicken");
            model6.setDrinkAlternate(null);
            model6.setCategory("Chicken");
            model6.setArea("Jamaican");
            model6.setInstructions("Squeeze lime over chicken and rub well....");
            model6.setMealThumb("");
            model6.setTags("Stew");
            model6.setYoutube("https://www.youtube.com/watch?v=_gFB1fkNhXs");
            model6.setIngredient1("Chicken");
            model6.setIngredient2("Tomato");
            model6.setIngredient3("Onions");
            model6.setIngredient4("Garlic Clove");
            model6.setIngredient5("Red Pepper");
            model6.setIngredient6("Carrots");
            model6.setIngredient7("Lime");
            model6.setIngredient8("Thyme");
            model6.setIngredient9("Allspice");
            model6.setIngredient10("Soy Sauce");
            model6.setIngredient11("Cornstarch");
            model6.setIngredient12("Coconut Milk");
            model6.setIngredient13("Vegetable Oil");
            model6.setMeasure1("1 whole");
            model6.setMeasure2("1 chopped");
            model6.setMeasure3("2 chopped");
            model6.setMeasure4("2 chopped");
            model6.setMeasure5("1 chopped");
            model6.setMeasure6("1 chopped");
            model6.setMeasure7("1");
            model6.setMeasure8("2 tsp");
            model6.setMeasure9("1 tsp");
            model6.setMeasure10("2 tsp");
            model6.setMeasure11("2 tsp");
            model6.setMeasure12("2 cups");
            model6.setMeasure13("1 tsp");

            database.mealDAO().insert(model6);
        }

        // Meal 7 ------------------------------------------
        {
            MealModel model7 = new MealModel();
            model7.setMeal("Chicken & mushroom Hotpot");
            model7.setDrinkAlternate(null);
            model7.setCategory("Chicken");
            model7.setArea("British");
            model7.setInstructions("Heat oven to 200C/180C fan/gas 6.... ");
            model7.setMealThumb("");
            model7.setTags(null);
            model7.setYoutube("https://www.youtube.com/watch?v=bXKWu4GojNI");
            model7.setIngredient1("Butter");
            model7.setIngredient2("Onion");
            model7.setIngredient3("Mushrooms");
            model7.setIngredient4("Plain Flour");
            model7.setIngredient5("Chicken Stock Cube");
            model7.setIngredient6("Nutmeg");
            model7.setIngredient7("Mustard Powder");
            model7.setIngredient8("Chicken");
            model7.setIngredient9("Sweetcorn");
            model7.setIngredient10("Potatoes");
            model7.setIngredient11("Butter");
            model7.setMeasure1("50g");
            model7.setMeasure2("1 chopped");
            model7.setMeasure3("100g");
            model7.setMeasure4("40g");
            model7.setMeasure5("1");
            model7.setMeasure6("pinch");
            model7.setMeasure7("pinch");
            model7.setMeasure8("250g");
            model7.setMeasure9("2 Handfuls");
            model7.setMeasure10("2 large");
            model7.setMeasure11("1 knob");

            database.mealDAO().insert(model7);
        }

        // Meal 8 ------------------------------------------
        {
            MealModel model8 = new MealModel();
            model8.setMeal("Chicken Alfredo Primavera");
            model8.setDrinkAlternate(null);
            model8.setCategory("Chicken");
            model8.setArea("Italian");
            model8.setInstructions("Heat oven to 200C/180C fan/gas 6.... ");
            model8.setMealThumb("");
            model8.setTags("Pasta,Meat,Dairy");
            model8.setYoutube("https://www.youtube.com/watch?v=qCIbq8HywpQ");
            model8.setIngredient1("Butter");
            model8.setIngredient2("Olive Oil");
            model8.setIngredient3("Chicken");
            model8.setIngredient4("Salt");
            model8.setIngredient5("Squash");
            model8.setIngredient6("Broccoli");
            model8.setIngredient7("mushrooms");
            model8.setIngredient8("Pepper");
            model8.setIngredient9("onion");
            model8.setIngredient10("garlic");
            model8.setIngredient11("red pepper flakes");
            model8.setIngredient12("white wine");
            model8.setIngredient13("milk");
            model8.setIngredient14("heavy cream");
            model8.setIngredient15("Parmesan cheese");
            model8.setIngredient16("bowtie pasta");
            model8.setIngredient17("Parsley");
            model8.setMeasure1("2 tablespoons");
            model8.setMeasure2("3 tablespoons");
            model8.setMeasure3("5 boneless");
            model8.setMeasure4("1 teaspoon");
            model8.setMeasure5("1 cut into 1/2-inch cubes");
            model8.setMeasure6("1 Head chopped");
            model8.setMeasure7("8-ounce sliced");
            model8.setMeasure8("1 red");
            model8.setMeasure9("1 chopped");
            model8.setMeasure10("3 cloves");
            model8.setMeasure11("1/2 teaspoon");
            model8.setMeasure12("1/2 cup");
            model8.setMeasure13("1/2 cup");
            model8.setMeasure14("1/2 cup");
            model8.setMeasure15("1 cup grated");
            model8.setMeasure16("16 ounces");
            model8.setMeasure17("chopped");

            database.mealDAO().insert(model8);
        }

        progressDialog.dismiss();

        Toast.makeText(this, "Meals Added", Toast.LENGTH_SHORT).show();
        
    }
}