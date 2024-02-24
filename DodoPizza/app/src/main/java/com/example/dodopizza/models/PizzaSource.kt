package com.example.dodopizza.models

import com.example.dodopizza.R

object PizzaSource {
    val pizzaList = arrayListOf<Pizza>(
        Pizza(
            title = "Cheesy",
            description = "Mozzarella cheese, cheddar cheese, parmesan cheese, Alfredo sauce",
            image = R.drawable.cheeze,
            cost = "from 1 900 ₸",
            shortDescription = "Medium 30cm, traditional dough, 580g",
            costSecond = "TO CART FOR 1 900 ₸"
            ),
        Pizza(
            title = "Naruto Pizza",
            description = "Chicken, teriyaki sauce, pineapple, mozzarella cheese, marinara sauce",
            image = R.drawable.naruto,
            cost = "from 3 900 ₸",
            shortDescription = "Medium 30cm, traditional dough, 580g",
            costSecond = "TO CART FOR 3 900 ₸"
        ),
        Pizza(
            title = "Carbonara",
            description = "Chicken ham, cheddar and parmesan cheeses, tomatoes, red onion, mozzarella, alfredo sauce",
            image = R.drawable.carbonara,
            cost = "from 2 400 ₸",
            shortDescription = "Medium 30cm, traditional dough, 580g",
            costSecond = "TO CART FOR 2 400 ₸"
        ),
        Pizza(
            title = "Arriva",
            description = "Chicken, spicy chorizo, burger sauce, sweet peppers, red onion, tomatoes, mozzarella, ranch sauce, garlic",
            image = R.drawable.arriva,
            cost = "from 2 400 ₸",
            shortDescription = "Medium 30cm, traditional dough, 590g",
            costSecond = "TO CART FOR 2 400 ₸"
        ),
        Pizza(
            title = "Bavarian",
            description = "Spicy chorizo sausages, pickled cucumbers, red onions, tomatoes, mustard sauce, mozzarella",
            image = R.drawable.bavarian,
            cost = "from 2 700 ₸",
            shortDescription = "Medium 30cm, traditional dough, 550g",
            costSecond = "TO CART FOR 2 700 ₸"
        ),
        Pizza(
            title = "Dodo Mix",
            description = "Four favorite pizzas in one: Carbonara, Pesto, Four Cheese, Ham and Cheese",
            image = R.drawable.dodo_mix,
            cost = "from 2 900 ₸",
            shortDescription = "Medium 30cm, traditional dough, 680g",
            costSecond = "TO CART FOR 2 900 ₸"
        )
    )

}