import models.Season;
import models.dishes.Dish;
import utils.CommonUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Controller {

    public static void inputArray(ArrayList<String> dishes, ArrayList<Double> prices) {
        System.out.println("Input string for array (dishes): ");
        for (; ; ) {
            String text = CommonUtils.scannerInput.next();
            if (text.contains(".")) {
                break;
            } else {
                dishes.add(text);
                System.out.print("Input prices: ");
                prices.add(CommonUtils.scannerInput.nextDouble());
            }
        }
    }

    public static void outputArrayList(ArrayList<String> dishes) {
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }

    public static void getPrice(ArrayList<String> dishes, String dishInput) {
        int found = 0;
        for (int i = 0; i < dishes.size(); i++) {
            if (dishes.get(i).equals(dishInput)) {
                System.out.println(dishes.get(i));
                found++;
                break;
            }
        }
        if (found == 0) {
            System.out.println("Dish not found!");
        }
    }
    public static void getMenu(SimpleDateFormat dateFormat, String dateInput) {
        Season seasonIndex = Season.SPRING;
        for (; ;) {
            dateInput = CommonUtils.scannerInput.nextLine();
            try {
                Date date = dateFormat.parse(dateInput);
                Calendar calender = Calendar.getInstance();
                System.out.println("Date: " + dateFormat.format(date));
                calender.setTime(date);
                if (calender.get(Calendar.MONTH) == 11) { //Winter
                    seasonIndex = Season.WINTER;
                } else if(calender.get(Calendar.MONTH) == 1 ||calender.get(Calendar.MONTH) == 2) { //Spring
                    seasonIndex = Season.SPRING;
                } else if(calender.get(Calendar.MONTH) == 3 || calender.get(Calendar.MONTH) == 4 || calender.get(Calendar.MONTH) == 5) { //Summer
                    seasonIndex = Season.SUMMER;
                } else if(calender.get(Calendar.MONTH) == 6 || calender.get(Calendar.MONTH) == 7 || calender.get(Calendar.MONTH) == 8) { //Autumn
                    seasonIndex = Season.AUTUMN;
                }
                System.out.println("System season Index currently: " + seasonIndex);
                break;
            } catch (ParseException e) {

            }
        }

        Main.menu.dishes.add(new Dish("Name", 100, 20));
        Main.menu.dishes.add(new Dish("Name2", 80, 0));
        if (seasonIndex == Season.WINTER) {
            Main.menu.dishes.add(new Dish("Winter_Dish", 100, 31));
        } else if (seasonIndex == Season.SPRING) {
            Main.menu.dishes.add(new Dish("Spring_Dish", 80, 10));
        } else if (seasonIndex == Season.SUMMER) {
            Main.menu.dishes.add(new Dish("Summer_Dish", 90, 80));
        } else if (seasonIndex == Season.AUTUMN) {
            Main.menu.dishes.add(new Dish("Autumn_Dish", 20, 0));
        }
        System.out.println(Main.menu);
    }

}
