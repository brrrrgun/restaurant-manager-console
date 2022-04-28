package models;

import models.dishes.Dish;
import models.dishes.SeasonalDish;

import java.util.ArrayList;

public class Menu {
    public ArrayList<Dish> dishes;
    public ArrayList<SeasonalDish> seasonalDishes;

    public Menu() {
        dishes = new ArrayList<>();
        seasonalDishes = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder dish1 = new StringBuilder();
        for (Dish dish : dishes) {
            dish1.append(dish.toString() + "\n");
        }
        return dish1.toString();
    }
}
