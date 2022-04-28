package models.dishes;

import models.Season;
import models.dishes.Dish;

public class SeasonalDish extends Dish {

    public Season season;

    public SeasonalDish(String name, double originalPrice, double discount, Season season) {
        super(name, originalPrice, discount);
        this.season = season;
    }
}
