import models.Season;
import models.dishes.Dish;
import models.dishes.SeasonalDish;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Controller {
    public static List<SeasonalDish> seasonalDishes = new ArrayList<SeasonalDish>();

    public static void getMenu(Season season) {
        //want to create menu?
        //1. default menu
        //2. custom menu (Enter number for more inputs [2. Single Season Input (Dish, Price, Discount, Season), 3. Only 1 season (Season, Name, Price, Discount) 4. Exit (Enter ".")])
        Main.menu.dishes.add(new Dish("Name", 100, 20));
        Main.menu.dishes.add(new Dish("Name2", 80, 0));
        if (season == Season.WINTER) {
            seasonalDishes.add(new SeasonalDish("Winter_Dish", 100, 31, Season.WINTER));
        } else if (season == Season.SPRING) {
            seasonalDishes.add(new SeasonalDish("Spring_Dish", 80, 10, Season.SPRING));
        } else if (season == Season.SUMMER) {
            seasonalDishes.add(new SeasonalDish("Spring_Dish", 80, 10, Season.SUMMER));
        } else if (season == Season.AUTUMN) {
            seasonalDishes.add(new SeasonalDish("Autumn_Dish", 20, 0, Season.AUTUMN));
        }
        System.out.println(Main.menu);
        System.out.println(seasonalDishes);
    }

    public static Season getSeason(SimpleDateFormat dateFormat, String dateInput) {
        Season season = Season.SPRING;
        for (; ; ) {
            try {
                Date date = dateFormat.parse(dateInput);
                Calendar calender = Calendar.getInstance();
                System.out.println("Date: " + dateFormat.format(date));
                calender.setTime(date);
                if (calender.get(Calendar.MONTH) == 11) { //Winter
                    season = Season.WINTER;
                } else if (calender.get(Calendar.MONTH) == 1 || calender.get(Calendar.MONTH) == 2) { //Spring
                    season = Season.SPRING;
                } else if (calender.get(Calendar.MONTH) == 3 || calender.get(Calendar.MONTH) == 4 || calender.get(Calendar.MONTH) == 5) { //Summer
                    season = Season.SUMMER;
                } else if (calender.get(Calendar.MONTH) == 6 || calender.get(Calendar.MONTH) == 7 || calender.get(Calendar.MONTH) == 8) { //Autumn
                    season = Season.AUTUMN;
                }
                System.out.println("System season Index currently: " + season);
                break;
            } catch (ParseException e) {

            }
        }
        return season;
    }

}
